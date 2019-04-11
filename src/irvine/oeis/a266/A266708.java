package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266708 Coefficient of x in minimal polynomial of the continued fraction <code>[1^n</code>,tau,1,1,1,...], where <code>1^n</code> means n ones and tau = golden ratio <code>= (1 + sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A266708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266708() {
    super(new long[] {-1, 2, 2}, new long[] {0, -10, -18});
  }
}
