package irvine.oeis.a080;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080636 Number of real invertible (0,1) n X n matrices with (-1,0,1) inverses.
 * @author Sean A. Irvine
 */
public class A080636 extends Sequence1 {

  private int mN = 0;

  private boolean is(final Matrix<Q> m) {
    for (int r = 0; r < m.rows(); ++r) {
      for (int c = 0; c < m.cols(); ++c) {
        final Q v = m.get(r, c);
        if (!v.isZero() && !v.abs().isOne()) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    long cnt = 0;
    final long lim = 1L << (mN * (mN + 1)) / 2;
    for (long s = 0; s < lim; ++s) {
      long t = s;
      for (int r = 0; r < mN; ++r) {
        for (int c = 0; c <= r; ++c) {
          m.set(r, c, (t & 1) == 0 ? Q.ZERO : Q.ONE);
          m.set(c, r, (t & 1) == 0 ? Q.ZERO : Q.ONE);
          t >>>= 1;
        }
      }
      if (!fld.det(m).isZero() && is(fld.inverse(m))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
