package irvine.oeis.a019;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.group.MultivariatePolynomialRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019447 Number of monomials in expansion of determinant of <code>an n</code> X n Toeplitz matrix [ t(|i-j|) ] in terms of its entries.
 * @author Sean A. Irvine
 */
public class A019447 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final MultivariatePolynomialRing poly = new MultivariatePolynomialRing(++mN);
    final MatrixRing<MultivariatePolynomial> ring = new MatrixRing<>(mN, poly);
    final Matrix<MultivariatePolynomial> toeplitz = new DefaultMatrix<>(mN, mN, poly.zero());
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        toeplitz.set(i, j, poly.var(Math.abs(i - j)));
      }
    }
    return Z.valueOf(ring.det(toeplitz).keySet().size());
  }
}
