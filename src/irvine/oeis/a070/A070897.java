package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070897 Number of ways of pairing numbers 1 to n with numbers n+1 to 2n such that each pair sums to a prime.
 * @author Sean A. Irvine
 */
public class A070897 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> ring = new MatrixField<>(++mN, Rationals.SINGLETON);
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j <= k; ++j) {
        if (mPrime.isPrime(k + j + mN + 2)) {
          m.set(k, j, Q.ONE);
          m.set(j, k, Q.ONE);
        }
      }
    }
    return ring.permanent(m).toZ();
  }
}

