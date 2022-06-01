package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266777 Molien series for invariants of finite Coxeter group A_8.
 * @author Sean A. Irvine
 */
public class A266777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266777() {
    super(new long[] {-1, 0, 1, 1, 1, 0, 0, -1, -1, -1, -2, -2, 0, 1, 2, 3, 3, 2, 1, 0, -2, -3, -4, -3, -2, 0, 1, 2, 3, 3, 2, 1, 0, -2, -2, -1, -1, -1, 0, 0, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 2, 4, 4, 7, 8, 11, 13, 19, 21, 29, 34, 44, 51, 66, 75, 95, 110, 134, 155, 189, 215, 258, 296, 349, 398, 468, 529, 617, 698, 804, 907, 1042, 1167, 1332, 1492, 1690, 1886, 2130, 2366});
  }
}
