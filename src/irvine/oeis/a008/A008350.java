package irvine.oeis.a008;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008350 Number of orbits of norm 2n vectors in E_8 lattice.
 * @author Sean A. Irvine
 */
public class A008350 implements Sequence {

  // After Noam D. Elkies

  private static final MatrixField<Q> M8 = new MatrixField<>(8, Rationals.SINGLETON);
  private static final Matrix<Q> M;
  static {
    Matrix<Q> m = M8.multiply(M8.one(), Q.TWO);
    for (int k = 0; k < 6; ++k) {
      m.set(k, k + 1, Q.NEG_ONE);
      m.set(k + 1, k, Q.NEG_ONE);
    }
    m.set(2, 7, Q.NEG_ONE);
    m.set(7, 2, Q.NEG_ONE);
    m = M8.inverse(m);
    M = m;
  }

  private int mN = -1;

  private long f(final long[] v, final Matrix<Q> m) {
    final Q[][] vq = new Q[1][v.length];
    for (int k = 0; k < v.length; ++k) {
      vq[0][k] = new Q(v[k]);
    }
    final Matrix<Q> mq = new DefaultMatrix<>(vq, Q.ZERO);
    final Matrix<Q> t = M8.multiply(M8.multiply(mq, m), mq.transpose());
    return t.get(0, 0).toZ().longValueExact();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long[] v = new long[8];
    long c = 0;
    int j = 0;
    while (j < 8) {
      j = 0;
      ++v[0];
      long k = f(v, M);
      while (k > 2 * mN) {
        v[j++] = 0;
        if (j < 8) {
          ++v[j];
          k = f(v, M);
        } else {
          k = 0;
        }
      }
      if (k / 2 == mN) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
