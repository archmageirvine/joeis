package irvine.oeis.a095;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A095077 Primes with four 1-bits in their binary expansion.
 * @author Georg Fischer
 */
public class A095077 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.bitCount() == 4) {
        return mP;
      }
    }
  }
}
