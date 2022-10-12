package irvine.oeis.a059;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059831 Determinant of Wilkinson's eigenvalue test matrix of order 2n+1.
 * @author Sean A. Irvine
 */
public class A059831 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 1; k < mN; ++k) {
      mat.set(k - 1, k, Q.ONE);
      mat.set(k, k - 1, Q.ONE);
    }
    final int n = mN / 2;
    for (int k = 0; k < mN; ++k) {
      mat.set(k, k, new Q(Math.abs(n - k)));
    }
    return fld.det(mat).toZ();
  }
}
