package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027697 Odious primes: primes with odd number of <code>1</code>'s in binary expansion.
 * @author Sean A. Irvine
 */
public class A027697 implements Sequence {

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
