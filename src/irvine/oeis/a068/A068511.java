package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068511 (Product of primes &lt;= n) - 2^(n-1).
 * @author Sean A. Irvine
 */
public class A068511 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mPrimeProduct = Z.ONE;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mPrimeProduct = mPrimeProduct.multiply(mN);
    }
    return mPrimeProduct.subtract(Z.ONE.shiftLeft(mN - 1));
  }
}

