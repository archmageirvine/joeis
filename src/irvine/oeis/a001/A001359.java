package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001359 Lesser of twin primes.
 * @author Sean A. Irvine
 */
public class A001359 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.add(2))) {
        return mP;
      }
    }
  }
}
