package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027699 Evil primes: primes with even number of 1's in their binary expansion.
 * @author Sean A. Irvine
 */
public class A027699 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 0) {
        return mP;
      }
    }
  }
}
