package irvine.oeis.a019;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019447.
 * @author Sean A. Irvine
 */
public class A019447 implements Sequence {

  // Only good for a few terms.  Represents the Toeplitz matrix of order n with [x^((n+1)^|i-j|)].
  // This is done because powers like x^n can occur during the determinant expansion.
  // Then count number of non-zero terms in the polynomial resulting from the determinant.
  // This would be better with a true multivariate ring.

  private static final PolynomialRing<Z> POLY_RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    final MatrixRing<Polynomial<Z>> ring = new MatrixRing<>(++mN, POLY_RING);
    final Matrix<Polynomial<Z>> toeplitz = new DefaultMatrix<>(mN, mN, POLY_RING.zero());
    final Z base = Z.valueOf(mN + 1);
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        toeplitz.set(i, j, POLY_RING.monomial(Z.ONE, base.pow(Math.abs(i - j)).intValueExact()));
      }
    }
    final Polynomial<Z> det = ring.det(toeplitz);
    long c = 0;
    for (final Z t : det) {
      if (!Z.ZERO.equals(t)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
