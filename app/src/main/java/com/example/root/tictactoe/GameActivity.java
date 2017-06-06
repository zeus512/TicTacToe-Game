package com.example.root.tictactoe;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Boolean player = true;
    int t1 = 1, t2 = 1, t3 = 1, t4 = 1, t5 = 1, t6 = 1, t7 = 1, t8 = 1, t9 = 1;
    TextView t;
    Animation scale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        scale = AnimationUtils.loadAnimation(this, R.anim.animation);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);
        t = (TextView) findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1 == 1) {
                    if (player) {
                        button1.startAnimation(scale);
                        button1.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button1.startAnimation(scale);
                        button1.setText("O");
                        player = true;
                        t.setText("X");

                    }
                    t1 = 0;
                    winner();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t2 == 1) {
                    if (player) {
                        button2.startAnimation(scale);
                        button2.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button2.startAnimation(scale);
                        button2.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t2 = 0;
                    winner();

                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t3 == 1) {
                    if (player) {
                        button3.startAnimation(scale);
                        button3.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button3.startAnimation(scale);
                        button3.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t3 = 0;
                    winner();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t4 == 1) {
                    if (player) {
                        button4.startAnimation(scale);
                        button4.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button4.startAnimation(scale);
                        button4.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t4 = 0;
                    winner();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t5 == 1) {
                    if (player) {
                        button5.startAnimation(scale);
                        button5.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button5.startAnimation(scale);
                        button5.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t5 = 0;
                    winner();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t6 == 1) {
                    if (player) {
                        button6.startAnimation(scale);
                        button6.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button6.startAnimation(scale);
                        button6.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t6 = 0;
                    winner();
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t7 == 1) {
                    if (player) {
                        button7.startAnimation(scale);
                        button7.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button7.startAnimation(scale);
                        button7.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t7 = 0;
                    winner();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t8 == 1) {
                    if (player) {
                        button8.startAnimation(scale);
                        button8.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button8.startAnimation(scale);
                        button8.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t8 = 0;
                    winner();
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t9 == 1) {
                    if (player) {
                        button9.startAnimation(scale);
                        button9.setText("X");
                        player = false;
                        t.setText("O");
                    } else {
                        button9.startAnimation(scale);
                        button9.setText("O");
                        player = true;
                        t.setText("X");
                    }
                    t9 = 0;
                    winner();
                }
            }
        });

    }

    private void winner() {
        if (button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X") {
            Toast.makeText(GameActivity.this, R.string.xwin, Toast.LENGTH_SHORT).show();
            t.setText(R.string.xwin);
            afterwin();

        } else if (button1.getText() == "O" && button2.getText() == "O" && button3.getText() == "O" || button1.getText() == "O" && button4.getText() == "O" && button7.getText() == "O" || button2.getText() == "O" && button5.getText() == "O" && button8.getText() == "O" || button3.getText() == "O" && button6.getText() == "O" && button9.getText() == "O" || button4.getText() == "O" && button5.getText() == "O" && button6.getText() == "O" || button7.getText() == "O" && button8.getText() == "O" && button9.getText() == "O" || button1.getText() == "O" && button5.getText() == "O" && button9.getText() == "O" || button3.getText() == "O" && button5.getText() == "O" && button7.getText() == "O") {
            Toast.makeText(GameActivity.this, R.string.owin, Toast.LENGTH_SHORT).show();
            t.setText(R.string.owin);
            afterwin();

        } else if (t1 == 0 && t2 == 0 && t3 == 0 & t4 == 0 && t5 == 0 && t6 == 0 && t7 == 0 && t8 == 0 && t9 == 0) {
            Toast.makeText(GameActivity.this, R.string.draw, Toast.LENGTH_SHORT).show();
            t.setText(R.string.draw);
            afterwin();
        }
    }

    public void afterwin() {
        button1.setClickable(false);
        button2.setClickable(false);
        button3.setClickable(false);
        button4.setClickable(false);
        button5.setClickable(false);
        button6.setClickable(false);
        button7.setClickable(false);
        button8.setClickable(false);
        button9.setClickable(false);
    }

    public void reset(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        player = true;
        t1 = 1;
        t2 = 1;
        t3 = 1;
        t4 = 1;
        t5 = 1;
        t6 = 1;
        t7 = 1;
        t8 = 1;
        t9 = 1;
        t.setText("X");
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);

    }
}
