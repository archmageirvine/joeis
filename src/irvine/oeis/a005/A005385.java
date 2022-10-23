package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005385 Safe primes p: (p-1)/2 is also prime.
 * @author Sean A. Irvine
 */
public class A005385 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.subtract(1).divide2())) {
        return mP;
      }
    }
  }
}
