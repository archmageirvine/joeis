package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066149 Primes with an odd number of 0's in binary expansion.
 * @author Georg Fischer
 */
public class A066149 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (((mP.bitLength() - mP.bitCount()) & 1) != 0) {
        return mP;
      }
    }
  }
}
