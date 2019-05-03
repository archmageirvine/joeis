package irvine.oeis.a019;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.group.MultivariatePolynomialRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019448 Number of monomials in expansion of determinant of an <code>n X n</code> Hankel matrix <code>[ t(i+j) ]</code> in terms of its entries.
 * @author Sean A. Irvine
 */
public class A019448 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final MultivariatePolynomialRing poly = new MultivariatePolynomialRing(2 * ++mN);
    final MatrixRing<MultivariatePolynomial> ring = new MatrixRing<>(mN, poly);
    final Matrix<MultivariatePolynomial> hankel = new DefaultMatrix<>(mN, mN, poly.zero());
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        hankel.set(i, j, poly.var(i + j));
      }
    }
    return Z.valueOf(ring.det(hankel).keySet().size());
  }
}
