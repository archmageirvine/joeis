package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279111 Number of non-equivalent ways to place <code>2 non-attacking</code> kings on an <code>n X n</code> board.
 * @author Sean A. Irvine
 */
public class A279111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279111() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 4, 13, 37, 75, 147, 246});
  }
}
