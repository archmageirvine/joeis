package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002496 Primes of the form k^2 + 1.
 * @author Sean A. Irvine
 */
public class A002496 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.subtract(1).isSquare()) {
        return mP;
      }
    }
  }
}
