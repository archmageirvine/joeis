package irvine.oeis.a280;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A280872 Primes that have exactly 7 zeros and 7 ones in their binary expansion.
 * @author Sean A. Irvine
 */
public class A280872 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(8273); // the prime before 8287

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.bitCount() == 7 && mP.bitLength() == 14) {
        return mP;
      }
    }
  }
}
