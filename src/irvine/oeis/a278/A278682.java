package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278682 Number of non-equivalent ways to place 3 non-attacking ferses on an n X n board.
 * @author Sean A. Irvine
 */
public class A278682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278682() {
    super(new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 0, 7, 45, 225, 709, 1974, 4524, 9614, 18382, 33425});
  }
}
