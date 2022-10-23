package irvine.oeis.a122;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A122821 Number of ways n can be represented as the arithmetic mean of consecutive primes.
 * @author Sean A. Irvine
 */
public class A122821 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      for (long q = p, m = 1, sum = p; sum <= m * mN; q = mPrime.nextPrime(q), sum += q, ++m) {
        if (sum == m * mN) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
