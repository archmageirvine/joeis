package irvine.math.function;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * Primorial, product of all primes up to and including the parameter.
 * @author Sean A. Irvine
 */
class Primorial extends AbstractFunction1 {

  // Dynamically growing table.  Provided the next request is not too much larger
  // than the current cache, then the cache is expanded. Otherwise, the new
  // value is calculated.

  private final Fast mPrime = new Fast();
  private final HashMap<Long, Z> mCache = new HashMap<>();
  {
    mCache.put(1L, Z.ONE);
  }
  private long mHighestInCache = 1;

  @Override
  public Z z(final long n) {
    final long endPrime = n <= 1 ? 1 : mPrime.prevPrime(n + 1);
    if (endPrime <= mHighestInCache) {
      return mCache.get(endPrime);
    }
    final boolean updateCache = endPrime < 3 * mHighestInCache;
    Z primorial = mCache.get(mHighestInCache);
    for (long p = mPrime.nextPrime(mHighestInCache); p <= endPrime; p = mPrime.nextPrime(p)) {
      primorial = primorial.multiply(p);
      if (updateCache) {
        mCache.put(p, primorial);
      }
    }
    if (updateCache) {
      mHighestInCache = endPrime;
    }
    return primorial;
  }
}
