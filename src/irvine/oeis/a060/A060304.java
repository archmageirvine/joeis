package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060304 Number of primes below n^3 does not exceed n times the number of primes below n^2.
 * @author Sean A. Irvine
 */
public class A060304 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;
  private long mQ = 2;
  private long mPi2 = 0;
  private long mPi3 = 0;

  @Override
  public Z next() {
    ++mN;
    while (mP < mN * mN) {
      ++mPi2;
      mP = mPrime.nextPrime(mP);
    }
    while (mQ < mN * mN * mN) {
      ++mPi3;
      mQ = mPrime.nextPrime(mQ);
    }
    return Z.valueOf(mPi2 * mN - mPi3);
  }
}
