package irvine.oeis.a095;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A095078 Primes with a single 0 bit in their binary expansion.
 * @author Georg Fischer
 */
public class A095078 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.bitCount() == mP.bitLength() - 1) {
        return mP;
      }
    }
  }
}
