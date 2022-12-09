package irvine.oeis.a095;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A095073 Primes in whose binary expansion the number of 1-bits is one more than the number of 0-bits.
 * @author Georg Fischer
 */
public class A095073 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final int n1 = mP.bitCount();
      if (n1 == (mP.bitLength() - n1) + 1) {
        return mP;
      }
    }
  }
}
