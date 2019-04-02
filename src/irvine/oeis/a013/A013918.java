package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013918 Primes equal to the sum of the first k primes for some k.
 * @author Sean A. Irvine
 */
public class A013918 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(mP);
      if (mPrime.isPrime(mSum)) {
        return mSum;
      }
    }
  }
}
