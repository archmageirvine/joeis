package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068320 a(n)=number of arithmetic progressions of primes, strictly increasing with sum n.
 * @author Sean A. Irvine
 */
public class A068320 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long cnt = mPrime.isPrime(++mN) ? 1 : 0;
    for (long p = mPrime.prevPrime(mN); p > 1; p = mPrime.prevPrime(p)) {
      for (long q = mPrime.prevPrime(p); q > 1; q = mPrime.prevPrime(q)) {
        long s = mN - p - q;
        long r = q;
        final long delta = p - q;
        while (s > 0) {
          r -= delta;
          if (!mPrime.isPrime(r)) {
            break;
          }
          s -= r;
        }
        if (s == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
