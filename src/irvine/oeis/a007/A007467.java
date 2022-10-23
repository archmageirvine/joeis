package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007467 Product of next n primes.
 * @author Sean A. Irvine
 */
public class A007467 extends Sequence1 {

  private long mN = -1;
  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    Z prod = mP;
    for (long k = 0; k < mN; ++k) {
      mP = mPrime.nextPrime(mP);
      prod = prod.multiply(mP);
    }
    return prod;
  }
}
