package irvine.oeis.a390;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390821 a(n) is the permanent of the unipotent Sylvester-Kac tridiagonal matrix of order n having main diagonal [0, 2, ..., 2*(n-1)], superdiagonal [1, 2, ..., n-1], and [subdiagonal 1-n, 2-n, ..., -1].
 * @author Sean A. Irvine
 */
public class A390821 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      m.set(k, k, Q.valueOf(2L * k));
    }
    for (int k = 1; k < mN; ++k) {
      m.set(k - 1, k, Q.valueOf(k));
      m.set(k, k - 1, Q.valueOf(k - mN));
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).permanent(m).toZ();
  }
}
