package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067604 Smallest prime p of two consecutive primes, p &lt; q, such that gcd(p+1, q+1) = 2n.
 * @author Sean A. Irvine
 */
public class A067604 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    while (true) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if (LongUtils.gcd(p + 1, q + 1) == mN) {
        return Z.valueOf(q);
      }
    }
  }
}

