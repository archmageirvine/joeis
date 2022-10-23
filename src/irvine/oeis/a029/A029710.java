package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029710 Primes such that next prime is 4 greater.
 * @author Sean A. Irvine
 */
public class A029710 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.add(4))) {
        return mP;
      }
    }
  }
}
