package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265804 Coefficient of <code>x^2</code> in minimal polynomial of the continued fraction <code>[1^n,5,1,1,1,...]</code>, where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A265804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265804() {
    super(new long[] {-1, 2, 2}, new long[] {1, 19, 29});
  }
}
