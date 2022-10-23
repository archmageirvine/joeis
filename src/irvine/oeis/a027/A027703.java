package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027703 Primes with even number of 1's in binary expansion such that next prime has odd number of 1's.
 * @author Sean A. Irvine
 */
public class A027703 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 0 && (mPrime.nextPrime(mP).bitCount() & 1) == 1) {
        return mP;
      }
    }
  }
}
