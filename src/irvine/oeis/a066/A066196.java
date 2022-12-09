package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066196 Primes which have an equal number of zeros and ones in their binary expansion.
 * @author Georg Fischer
 */
public class A066196 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final int n1 = mP.bitCount();
      if (n1 == (mP.bitLength() - n1)) {
        return mP;
      }
    }
  }
}
