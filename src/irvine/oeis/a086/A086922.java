package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086922 Number of idempotent n X n (0,1) matrices over the reals.
 * @author Sean A. Irvine
 */
public class A086922 extends Sequence0 {

  // Only good for a few initial terms

  private long mN = -1;

  @Override
  public Z next() {
    final MatrixRing<Z> ring = new MatrixRing<>(++mN, Integers.SINGLETON);
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    long cnt = 0;
    final long lim = 1L << (mN * mN);
    for (long s = 0; s < lim; ++s) {
      for (long k = 0, t = s; k < mN; ++k) {
        for (long j = 0; j < mN; ++j, t >>>= 1) {
          final Z v = (t & 1) == 0 ? Z.ZERO : Z.ONE;
          m.set(k, j, v);
        }
      }
      if (ring.multiply(m, m).equals(m)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
