package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266708 Coefficient of x in minimal polynomial of the continued fraction [1^n,tau,1,1,1,...], where 1^n means n ones and tau = golden ratio = (1 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A266708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266708() {
    super(new long[] {-1, 2, 2}, new long[] {0, -10, -18});
  }
}
