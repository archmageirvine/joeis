package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266800 Coefficient of x in the minimal polynomial of the continued fraction <code>[1^n,sqrt(3),1,1,</code>...], where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A266800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266800() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-8, -12, -98, -636, -4424});
  }
}
