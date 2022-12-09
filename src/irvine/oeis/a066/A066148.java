package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066148 Primes with an even number of 0&apos;s in binary expansion.
 * @author Georg Fischer
 */
public class A066148 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (((mP.bitLength() - mP.bitCount()) & 1) == 0) {
        return mP;
      }
    }
  }
}
