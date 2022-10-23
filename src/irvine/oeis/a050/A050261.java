package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050261 Primes which are not quiteprimes.
 * @author Sean A. Irvine
 */
public class A050261 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      final long s = LongUtils.sqrt(mN);
      for (long p = 2; p <= s; p = mPrime.nextPrime(p)) {
        final long q = p + 1 - Math.abs((mN % p) * 2  - p);
        if (q * q < p) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

