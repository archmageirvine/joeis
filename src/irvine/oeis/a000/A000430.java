package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000430 Primes and squares of primes.
 * @author Sean A. Irvine
 */
public class A000430 extends Sequence1 {

  private Z mN = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mPrime.isPrime(mN)) {
        return mN;
      }
      final Z[] s = mN.sqrtAndRemainder();
      if (s[1].isZero() && mPrime.isPrime(s[0])) {
        return mN;
      }
    }
  }
}

