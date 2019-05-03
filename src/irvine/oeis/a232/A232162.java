package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232162 Number of Weyl group elements, not containing an <code>s_r</code> factor, which contribute nonzero terms to Kostant's weight multiplicity formula when computing the multiplicity of the zero-weight in the adjoint representation for the Lie algebra of type B and rank n.
 * @author Sean A. Irvine
 */
public class A232162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232162() {
    super(new long[] {1, 3, 1, 1}, new long[] {0, 0, 2, 3});
  }
}
