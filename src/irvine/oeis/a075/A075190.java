package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075190 Numbers k such that k^2 is an interprime = average of two successive primes.
 * @author Sean A. Irvine
 */
public class A075190 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z k = Z.valueOf(++mN).square();
      if (mPrime.prevPrime(k).add(mPrime.nextPrime(k)).equals(k.multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
