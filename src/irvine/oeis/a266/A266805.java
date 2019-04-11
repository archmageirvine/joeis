package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266805 Coefficient of x in the minimal polynomial of the continued fraction <code>[1^n,sqrt(6),1,1,...],</code> where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A266805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266805() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-14, -90, -722, -4830, -33554});
  }
}
