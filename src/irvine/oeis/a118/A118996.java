package irvine.oeis.a118;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A118996 Number of real n X n symmetric (0,1) matrices with negative determinant.
 * @author Sean A. Irvine
 */
public class A118996 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> ring = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    long cnt = 0;
    final long lim = 1L << Functions.TRIANGULAR.i(mN);
    for (long s = 0; s < lim; ++s) {
      for (long k = 0, t = s; k < mN; ++k) {
        for (long j = k; j < mN; ++j, t >>>= 1) {
          final Q v = (t & 1) == 0 ? Q.ZERO : Q.ONE;
          m.set(k, j, v);
          m.set(j, k, v);
        }
      }
      if (ring.det(m).signum() < 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
