package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058202 Triangle in which n-th row gives the numbers which when subtracted from 2^n produce primes.
 * @author Sean A. Irvine
 */
public class A058202 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.TWO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mP = mPrime.prevPrime(mP);
    if (mP.isZero()) {
      mN = mN.multiply2();
      mP = mPrime.prevPrime(mN);
    }
    return mN.subtract(mP);
  }
}
