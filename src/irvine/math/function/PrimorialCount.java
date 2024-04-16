package irvine.math.function;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * Return the product of specified number of primes.
 * @author Sean A. Irvine
 */
class PrimorialCount extends AbstractFunction1 {

  // Dynamically growing table.  Provided the next request is not too much larger
  // than the current cache, then the cache is expanded. Otherwise, the new
  // value is calculated.

  private final Fast mPrime = new Fast();
  private final ArrayList<Z> mCache = new ArrayList<>();
  {
    mCache.add(Z.ONE);
  }
  private long mHighestPrimeInCache = 1;

  @Override
  public Z z(final long n) {
    if (n < mCache.size()) {
      return mCache.get((int) n);
    }
    final boolean updateCache = n < 2L * mCache.size();
    Z primorial = mCache.get(mCache.size() - 1);
    for (long k = mCache.size(), p = mHighestPrimeInCache; k <= n; ++k) {
      p = mPrime.nextPrime(p);
      primorial = primorial.multiply(p);
      if (updateCache) {
        mCache.add(primorial);
        mHighestPrimeInCache = p;
      }
    }
    return primorial;
  }
}
