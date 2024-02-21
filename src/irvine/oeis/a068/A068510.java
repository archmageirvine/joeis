package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068510 a(n) = lcm(1,...,n) - (product of primes &lt;= n).
 * @author Sean A. Irvine
 */
public class A068510 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mLcm = Z.ONE;
  private Z mPrimeProduct = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(Z.valueOf(++mN));
    if (mPrime.isPrime(mN)) {
      mPrimeProduct = mPrimeProduct.multiply(mN);
    }
    return mLcm.subtract(mPrimeProduct);
  }
}

