package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086647 Number of monomials in expansion of permanent of an n X n Toeplitz matrix [t(|i-j|) ] in terms of its entries.
 * @author Sean A. Irvine
 */
public class A086647 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final MultivariatePolynomialField<Z> poly = new MultivariatePolynomialField<>(IntegerField.SINGLETON, ++mN);
    final MatrixRing<MultivariatePolynomial<Z>> ring = new MatrixRing<>(mN, poly);
    final Matrix<MultivariatePolynomial<Z>> toeplitz = new DefaultMatrix<>(mN, mN, poly.zero());
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        toeplitz.set(i, j, poly.var(Math.abs(i - j)));
      }
    }
    return Z.valueOf(ring.permanent(toeplitz).keySet().size());
  }
}
