package irvine.oeis.a234;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A234576 Number of Weyl group elements, not containing s_1 or s_2, which contribute nonzero terms to Kostant's weight multiplicity formula when computing the multiplicity of the zero-weight in the adjoint representation for the Lie algebra of type D and rank n.
 * @author Sean A. Irvine
 */
public class A234576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234576() {
    super(new long[] {1, 3, 1, 1}, new long[] {4, 7, 14, 34});
  }
}
