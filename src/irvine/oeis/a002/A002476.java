package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002476 Primes of the form 6m + 1.
 * @author Sean A. Irvine
 */
public class A002476 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(3) == 1) {
        return mP;
      }
    }
  }
}
