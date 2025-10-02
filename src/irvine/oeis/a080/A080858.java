package irvine.oeis.a080;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080858 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private boolean is(final DefaultMatrix<Q> m) {
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    if (fld.det(m).signum() <= 0) {
      return false;
    }
    Matrix<Q> s = m;
    for (int k = mN - 1; k > 0; --k) {
      s = s.delete(k, k);
      final MatrixField<Q> f = new MatrixField<>(k, Rationals.SINGLETON);
      if (f.det(s).signum() <= 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
    }
    final int maxM = mN * (mN - 1) / 2;
    if (mM == 0 || mM == maxM) {
      return Z.ONE;
    }
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      m.set(k, k, Q.TWO);
    }
    long cnt = 0;
    for (long s = (1L << mM) - 1; s < 1L << maxM; s = Functions.SWIZZLE.l(s)) {
      long t = s;
      for (int k = 0; k < mN; ++k) {
        for (int j = k + 1; j < mN; ++j) {
          final Q v = (t & 1) == 0 ? Q.ZERO : Q.ONE;
          m.set(k, j, v);
          m.set(j, k, v);
          t >>>= 1;
        }
      }
      assert t == 0;
      if (is(m)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

