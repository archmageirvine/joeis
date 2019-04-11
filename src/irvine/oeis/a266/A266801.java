package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266801 Coefficient of <code>x^2</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(3),1,1,</code>...], where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A266801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266801() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-7, 23, 65, 653, 3935});
  }
}
