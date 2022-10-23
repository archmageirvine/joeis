package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002476 Primes of the form 6m + 1.
 * @author Sean A. Irvine
 */
public class A002476 extends Sequence1 {

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
