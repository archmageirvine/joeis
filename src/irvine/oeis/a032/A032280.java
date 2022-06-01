package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032280 Number of bracelets (turnover necklaces) of n beads of 2 colors, 7 of them black.
 * @author Sean A. Irvine
 */
public class A032280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032280() {
    super(new long[] {1, -3, 0, 8, -6, -6, 8, -1, 0, 1, -8, 6, 6, -8, 0, 3}, new long[] {1, 1, 4, 8, 20, 38, 76, 133, 232, 375, 600, 912, 1368, 1980, 2829, 3936});
  }
}
