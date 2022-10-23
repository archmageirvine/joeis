package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005383 Primes p such that (p+1)/2 is prime.
 * @author Sean A. Irvine
 */
public class A005383 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.add(1).divide2())) {
        return mP;
      }
    }
  }
}
