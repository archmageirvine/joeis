package irvine.oeis.a234;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A234597 Number of Weyl group elements, not containing an s_1 factor, which contribute nonzero terms to Kostant's weight multiplicity formula when computing the multiplicity of the zero-weight in the adjoint representation for the Lie algebra of type D and rank n.
 * @author Sean A. Irvine
 */
public class A234597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234597() {
    super(4, new long[] {1, 3, 1, 1}, new long[] {5, 11, 21, 48});
  }
}
