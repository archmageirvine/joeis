package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083339 a(n) is the number of distinct prime factors of n that occur in partitions into two primes when n is even and into three primes when n is odd.
 * @author Sean A. Irvine
 */
public class A083339 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return mPrime.isPrime(mN / 2) ? Z.ONE : Z.ZERO;
    }
    if (mPrime.isPrime(mN)) {
      return Z.ZERO;
    }
    final HashSet<Long> seen = new HashSet<>();
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      for (long q = p; p + q < mN; q = mPrime.nextPrime(q)) {
        final long r = mN - p - q;
        if (mPrime.isPrime(r)) {
          if (mN % p == 0) {
            seen.add(p);
          }
          if (mN % q == 0) {
            seen.add(q);
          }
          if (mN % r == 0) {
            seen.add(r);
          }
        }
      }
    }
    return Z.valueOf(seen.size());
  }
}
