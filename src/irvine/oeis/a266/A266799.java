package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266799 Coefficient of <code>x^0</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(3),1,1,...],</code> where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A266799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266799() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {1, 1, 49, 229, 1861});
  }
}
