package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086875 Sum of rank(M) over all n X n matrices over Z with all entries zero or one.
 * @author Sean A. Irvine
 */
public class A086875 extends Sequence1 {

  private int mN = 0;

  private boolean bump(final Matrix<Q> mat) {
    for (long row = mat.rows() - 1; row >= 0; --row) {
      for (long col = mat.cols() - 1; col >= 0; --col) {
        if (mat.get(row, col).isZero()) {
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
    Z rankSum = Z.ZERO;
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(fld.zero(), Q.ZERO);
    do {
      rankSum = rankSum.add(fld.rank(mat));
    } while (bump(mat));
    return rankSum;
  }
}
