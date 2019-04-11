package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266808 Coefficient of x in the minimal polynomial of the continued fraction <code>[1^n,sqrt(2)+sqrt(3),1,1,</code>...], where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A266808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266808() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {-168, -560, -101124, -3288624, -180132168, -7998247028L, -384048485640L, -17892957477264L, -843263161727364L});
  }
}
