package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A390531 a(n) is the smallest number k such that the first k prime numbers can be partitioned into n subsets of equal sums.
 * @author Sean A. Irvine
 */
public class A390531 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrimeGenerator = new Fast();
  private int mN = 0;

  // Variables used during bin packing
  private int mBinSize = 0;
  private int[] mPrimes = null;
  private boolean[] mUsed = null;

  private boolean is(final int current, final int bin, final int pos) {
    if (bin == mN) {
      return true;
    }
    for (int k = pos - 1; k >= 0; --k) {
      if (!mUsed[k]) {
        final int c = current + mPrimes[k];
        if (c <= mBinSize) {
          mUsed[k] = true;
          if (c == mBinSize) {
            // We have exactly filled the current bin.
            // Move to the next bin.
            // We also know a priori that at least the largest "bin" values have been used,
            // hence we can pass used.length - bin - 1 as an upper bound on starting position
            // for the next bin.
            if (is(0, bin + 1, mUsed.length - bin - 1)) {
              return true;
            }
            // It would be really nice to be able to say if we get here that no complete
            // packing is possible, but that is simply not true. Unfortunately, different
            // combinations that can fill the first bin, can lead to different success
            // later in the search.
          } else {
            if (is(c, bin, k)) {
              return true;
            }
          }
          mUsed[k] = false;
          if (current == 0) {
            break; // WLOG, starting a new bin should always use largest unused
          }
        }
      }
    }
    return false;
  }

  private boolean is(final int k, final int sum) {
    // Precompute static information for a given bin packing instance
    mBinSize = sum / mN;

    // For maximum speed during the packing, precompute the primes we need as int
    mPrimes = new int[k];
    mPrimes[0] = 2;
    for (int j = 1; j < mPrimes.length; ++j) {
      mPrimes[j] = (int) mPrimeGenerator.nextPrime(mPrimes[j - 1]);
    }
    mUsed = new boolean[k];
    if (mVerbose) {
      StringUtils.message("Trying bins=" + mN + " binsize=" + mBinSize + " primes=" + k);
    }
    return is(0, 0, mUsed.length);
  }

  private boolean isFeasible(final int n, final int sum, final int primes, final long maxp) {
    if (sum % n != 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }
    final int binSize = sum / n;
    // The following condition due to Ballard eliminates certain difficult cases.
    if ((binSize & 1) == 0) {
      // An even sized bin must contain an even number of odd primes
      if (4 * n > primes) {
        // We do not have sufficient odd primes for at least 4 in every bin,
        // therefore at least one bin must contain only two odd primes.
        // So check how many bins with only 2 primes can be constructed
        final int deficit = 4 * n - primes;
        long p = maxp;
        int possiblePairs = 0;
        boolean use2 = false;
        while (p > 2) {
          final long q = binSize - p;
          if (q < p && mPrimeGenerator.isPrime(q)) {
            ++possiblePairs;
          }
          if (!use2) {
            // We can also have a bin containing the prime 2 and two odd primes.
            // But we can only ever use 2 once.
            final long r = binSize - 2 - p;
            if (r < p && mPrimeGenerator.isPrime(r)) {
              use2 = true;
            }
          }
          p = mPrimeGenerator.prevPrime(p);
        }
        if (use2) {
          ++possiblePairs;
        }
        if (possiblePairs < (deficit + 1) / 2) {
          if (mVerbose) {
            StringUtils.message("Pigeonhole rejects bins=" + n + " binsize=" + binSize + " primes=" + primes);
          }
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    int sum = 2;
    int k = 1;
    long p = 2;
    while (true) {
      if (isFeasible(mN, sum, k, p) && is(k, sum)) {
        return Z.valueOf(k);
      }
      p = mPrimeGenerator.nextPrime(p);
      sum += p;
      ++k;
    }
  }
}
