package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024447 Sum of the products of the primes taken 2 at a time from the first n primes.
 * @author Sean A. Irvine
 */
public class A024447 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mSumOfPrimes = Z.ZERO;
  private long mP = 2;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      mSumOfPrimes = mSumOfPrimes.add(mP);
      mP = mPrime.nextPrime(mP);
      mA = mA.add(mSumOfPrimes.multiply(mP));
    }
    return mA;
  }
}
