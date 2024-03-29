package irvine.oeis.a205;
// Generated by gen_seq4.pl triuple at 2021-10-25 19:35

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A205456 Symmetric matrix by antidiagonals: C(max(i,j),min(i,j)), i&gt;=1, j&gt;=1.
 *
 * @author Georg Fischer
 */
public class A205456 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A205456() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return irvine.math.z.Binomial.binomial(Math.max(i, j), Math.min(i, j));
  }
}
