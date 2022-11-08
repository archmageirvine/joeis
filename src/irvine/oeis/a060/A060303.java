package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060303 Number of primes below n^2 does not exceed n times the number of primes below n.
 * @author Sean A. Irvine
 */
public class A060303 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;
  private long mPi = 0;
  private long mPi2 = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      ++mPi;
    }
    while (mP < mN * mN) {
      ++mPi2;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mPi * mN - mPi2);
  }
}
