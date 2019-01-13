package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.group.MatrixField;
import irvine.math.q.Rationals;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000927.
 * @author Sean A. Irvine
 */
public class A000927 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mP);
    final long q = (int) ((mP - 1) / 2) - 2;
    final MatrixField<Q> ring = new MatrixField<>(q, Rationals.SINGLETON);
    final DefaultMatrix<Q> m = new DefaultMatrix<>(q, q, Q.ONE);
    for (long i = 0; i < q; ++i) {
      for (long j = 0; j < q; ++j) {
        m.set(i, j, new Q((i + 3) * (j + 3) / mP - (i + 2) * (j + 3) / mP));
      }
    }
    return ring.det(m).toZ().abs();
  }
}
