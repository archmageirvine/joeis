package irvine.oeis.a057;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057981 Number of singular n X n (-1,0,1)-matrices.
 * @author Sean A. Irvine
 */
public class A057981 extends Sequence0 {

  private int mN = -1;

  private boolean bump(final Matrix<Q> mat) {
    for (long y = 0; y < mat.rows(); ++y) {
      for (long x = 0; x < mat.cols(); ++x) {
        final Q v = mat.get(y, x);
        if (v == Q.ZERO) {
          mat.set(y, x, Q.ONE);
          return true;
        } else if (v == Q.ONE) {
          mat.set(y, x, Q.NEG_ONE);
          return true;
        } else {
          assert v == Q.NEG_ONE;
          mat.set(y, x, Q.ZERO);
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final MatrixField<Q> ring = new MatrixField<>(mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    long cnt = 0;
    do {
      if (ring.det(mat).isZero()) {
        ++cnt;
      }
    } while (bump(mat));
    return Z.valueOf(cnt);
  }
}
