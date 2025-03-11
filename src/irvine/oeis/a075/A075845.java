package irvine.oeis.a075;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075845 Associated to determinants of skew-symmetric matrices related to Catalan-numbers or central binomial coefficients.
 * @author Sean A. Irvine
 */
public class A075845 extends Sequence1 {

  private int mN = 0;

  private Q alpha(final long n) {
    return n == 0 ? Q.ZERO : Q.valueOf(Functions.CATALAN.z(n - 1));
  }

  private Q beta(final long n) {
    return alpha(n).negate();
  }

  @Override
  public Z next() {
    mN += 2;
    final MatrixField<Q> ring = new MatrixField<>(mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int c = 0; c < mN; ++c) {
      mat.set(0, c, alpha(c));
    }
    for (int row = 1; row < mN; ++row) {
      mat.set(row, 0, beta(row));
      for (int col = 1; col < mN; ++col) {
        mat.set(row, col, mat.get(row - 1, col).add(mat.get(row, col - 1)));
      }
    }
    return ring.det(mat).toZ().sqrt();
  }
}
