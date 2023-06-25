package irvine.oeis.a064;

import java.util.Arrays;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064231 Triangle read by rows: T(n,k) = number of rational (+1,-1) matrices of rank k (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A064231 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private long[] mCnt = null;

  private boolean bump(final Matrix<Q> mat) {
    for (long row = mat.rows() - 1; row >= 0; --row) {
      for (long col = mat.cols() - 1; col >= 0; --col) {
        if (mat.get(row, col).equals(Q.NEG_ONE)) {
          mat.set(row, col, Q.ONE);
          return true;
        } else {
          mat.set(row, col, Q.NEG_ONE);
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
      final Q[][] d = new Q[mN][mN];
      for (final Q[] t : d) {
        Arrays.fill(t, Q.NEG_ONE);
      }
      final Matrix<Q> mat = new DefaultMatrix<>(d, Q.ZERO);
      do {
        ++mCnt[(int) fld.rank(mat)];
      } while (bump(mat));
      mM = 1;
    }
    return Z.valueOf(mCnt[mM]);
  }
}
