package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005382 Primes p such that 2p-1 is also prime.
 * @author Sean A. Irvine
 */
public class A005382 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.multiply2().subtract(1))) {
        return mP;
      }
    }
  }
}
