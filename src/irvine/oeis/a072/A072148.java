package irvine.oeis.a072;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072148 Number of invertible (-1,0,1) n X n matrices having (Tij = -Tji; i&lt;j) such that all T^k (k= 1..12) are also (-1,0,1) matrices.
 * @author Sean A. Irvine
 */
public class A072148 extends Sequence1 {

  private int mN = 0;

  private boolean bump(final Matrix<Q> mat) {
    for (long row = mat.rows() - 1; row >= 0; --row) {
      for (long col = row; col >= 0; --col) {
        final Q t = mat.get(row, col);
        if (t == Q.ZERO) { // deliberate use of == rather than equals()
          mat.set(row, col, Q.NEG_ONE);
          if (row != col) {
            mat.set(col, row, Q.ONE);
          }
          return true;
        } else if (t == Q.NEG_ONE && (row != col || row > 0)) { // deliberate use of == rather than equals()
          mat.set(row, col, Q.ONE);
          if (row != col) {
            mat.set(col, row, Q.NEG_ONE);
          }
          return true;
        } else {
          mat.set(row, col, Q.ZERO);
          mat.set(col, row, Q.ZERO);
        }
      }
    }
    return false;
  }

  private boolean is(final Matrix<Q> m) {
    for (long k = 0; k < m.rows(); ++k) {
      for (long j = 0; j < m.cols(); ++j) {
        if (m.get(k, j).toZ().abs().compareTo(Z.ONE) > 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(fld.zero(), Q.ZERO);
    long cnt = 0;
    do {
      if (!fld.det(mat).isZero()) {
        final Matrix<Q> m12 = fld.pow(mat, 12);
        if (is(m12)) {
          cnt += mat.get(0, 0).isZero() ? 1 : 2;
        }
      }
    } while (bump(mat));
    return Z.valueOf(cnt);
  }
}
