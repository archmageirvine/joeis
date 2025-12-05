package irvine.oeis.a122;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A122821 Number of ways n can be represented as the arithmetic mean of consecutive primes.
 * @author Sean A. Irvine
 */
public class A122821 extends Sequence1 implements DirectSequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final long nl = n.longValueExact();
    long cnt = 0;
    for (long p = 2; p <= nl; p = mPrime.nextPrime(p)) {
      for (long q = p, m = 1, sum = p; sum <= m * nl; q = mPrime.nextPrime(q), sum += q, ++m) {
        if (sum == m * nl) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
