package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A081942.
 * @author Sean A. Irvine
 */
public class A390531 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean is(final boolean[] used, final long binSize, final long current, final int bin, final int pos) {
    if (bin == mN) {
      return true;
    }
    for (int k = pos - 1; k >= 0; --k) {
      if (!used[k]) {
        final long c = current + Functions.PRIME.l(k + 1);
        if (c <= binSize) {
          used[k] = true;
          if (c == binSize) {
            if (is(used, binSize, 0, bin + 1, used.length)) { // move to next bin
              return true;
            }
          } else {
            if (is(used, binSize, c, bin, k)) {
              return true;
            }
          }
          used[k] = false;
          if (current == 0) {
            break; // WLOG, starting a new bin should always be able to use largest unused
          }
        }
      }
    }
    return false;
  }

  private boolean is(final int k, final long sum) {
    final long m = sum / mN; // size of each bin
    final boolean[] used = new boolean[k];
    if (mVerbose) {
      StringUtils.message("Trying bins=" + mN + " binsize=" + m + " primes=" + k);
    }
    return is(used, m, 0, 0, used.length);
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 2;
    int k = 1;
    long p = 2;
    while (true) {
      if (sum % mN == 0 && is(k, sum)) {
        return Z.valueOf(k);
      }
      p = mPrime.nextPrime(p);
      sum += p;
      ++k;
    }
  }
}
