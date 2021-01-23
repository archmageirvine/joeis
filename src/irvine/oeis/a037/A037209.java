package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037209 Primes n such that nextprime(n) - n = ( number of divisors of (nextprime(n)+n)/2 )-1.
 * @author Sean A. Irvine
 */
public class A037209 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      final long p = mPrime.nextPrime(mN);
      if (Z.valueOf(p - mN).equals(Cheetah.factor((p + mN) / 2).sigma0().subtract(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
