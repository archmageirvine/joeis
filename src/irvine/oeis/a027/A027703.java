package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027703 Primes with even number of <code>1</code>'s in binary expansion such that next prime has odd number of <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A027703 implements Sequence {

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
