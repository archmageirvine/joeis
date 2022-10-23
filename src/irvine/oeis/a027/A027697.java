package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027697 Odious primes: primes with odd number of 1's in binary expansion.
 * @author Sean A. Irvine
 */
public class A027697 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 1) {
        return mP;
      }
    }
  }
}
