package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279448.
 * @author Sean A. Irvine
 */
public class A279448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279448() {
    super(new long[] {1, -4, 1, 16, -19, -20, 45, 0, -45, 20, 19, -16, -1, 4}, new long[] {0, 1, 17, 202, 1397, 6582, 24185, 73496, 195086, 463875, 1013505, 2061426, 3956947, 7222992});
  }
}
