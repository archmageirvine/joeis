package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287997 Expansion of 1/((1-x)(1-x^3)(1-x^5) ... (1-x^13)).
 * @author Sean A. Irvine
 */
public class A287997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287997() {
    super(new long[] {1, -1, 0, -1, 1, -1, 1, -1, 2, -2, 2, -2, 3, -3, 3, -3, 4, -4, 3, -4, 4, -5, 4, -4, 5, -5, 4, -4, 5, -4, 4, -3, 4, -4, 3, -3, 3, -3, 2, -2, 2, -2, 1, -1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 3, 4, 5, 6, 8, 10, 12, 15, 18, 22, 26, 31, 36, 43, 50, 58, 68, 78, 90, 103, 118, 134, 153, 173, 195, 220, 247, 277, 310, 346, 385, 429, 475, 526, 582, 642, 707, 778, 854, 936, 1026, 1121, 1224, 1335});
  }
}
