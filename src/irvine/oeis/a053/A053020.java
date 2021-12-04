package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053020 Numbers which, when expressed as a sum of distinct primes with maximum product, use a non-maximal number of primes.
 * @author Sean A. Irvine
 */
public class A053020 implements Sequence {

  // This is very slow...

  private final Fast mPrime = new Fast();
  private long mN = 318;
  private int mMaxNumberPrimes = 0;
  private Z mMaxProduct = Z.ONE;
  private int mMaxProductPrimeCount = 0;

  private void search(final long n, final long p, final int count, final Z product) {
    if (n == 0) {
      if (count > mMaxNumberPrimes) {
        mMaxNumberPrimes = count;
      }
      if (product.compareTo(mMaxProduct) > 0) {
        mMaxProduct = product;
        mMaxProductPrimeCount = count;
      }
      return;
    }
    for (long q = mPrime.nextPrime(p); q <= n; q = mPrime.nextPrime(q)) {
      search(n - q, q, count + 1, product.multiply(q));
    }
  }

  @Override
  public Z next() {
    while (true) {
      mMaxNumberPrimes = 0;
      mMaxProduct = Z.ONE;
      mMaxProductPrimeCount = 0;
      search(++mN, 1, 0, Z.ONE);
      if (mMaxProductPrimeCount < mMaxNumberPrimes) {
        return Z.valueOf(mN);
      }
      //System.out.println("Done: " + mN + " maxprod=" + mMaxProduct + " maxprimes=" + mMaxNumberPrimes + " mpbp=" + mMaxProductPrimeCount);
    }
  }
}
