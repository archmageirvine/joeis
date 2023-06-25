package irvine.oeis.a064;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064230 Triangle T(n,k) = number of rational (0,1) matrices of rank k (n &gt;= 0, 0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A064230 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private long[] mCnt = null;

  private boolean bump(final Matrix<Q> mat) {
    for (long row = mat.rows() - 1; row >= 0; --row) {
      for (long col = mat.cols() - 1; col >= 0; --col) {
        if (mat.get(row, col).equals(Q.ZERO)) {
          mat.set(row, col, Q.ONE);
          return true;
        } else {
          mat.set(row, col, Q.ZERO);
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
      mCnt = new long[mN + 1];
      final Matrix<Q> mat = new DefaultMatrix<>(fld.zero(), Q.ZERO);
      do {
        ++mCnt[(int) fld.rank(mat)];
      } while (bump(mat));
      mM = 0;
    }
    return Z.valueOf(mCnt[mM]);
  }
}
