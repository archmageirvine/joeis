package irvine.oeis.a393;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A393151 Least prime representable as a sum of n prime powers using each of the first 2n primes exactly once as bases and exponents, and -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A393151 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long[] mS;
  private int mN = 0;
  private Z mMin = null;

  private void search(final Z sum, final int pos) {
    if (pos >= mS.length) {
      if ((mMin == null || sum.compareTo(mMin) < 0) && sum.isProbablePrime()) {
        mMin = sum;
        if (mVerbose) {
          StringUtils.message("New minimum: " + mMin + " " + Arrays.toString(mS));
        }
      }
      return;
    }
    for (int k = pos; k < mS.length; ++k) {
      final long t = mS[pos];
      mS[pos] = mS[k];
      mS[k] = t;
      // Even position is base, odd position is exponent
      if ((pos & 1) == 0) {
        // Enforce increasing bases and 2 never used as base when n is odd
        if ((pos == 0 || mS[pos - 2] < mS[pos]) && ((mN & 1) == 0 || mS[pos] != 2)) {
          search(sum, pos + 1);
        }
      } else {
        final Z newSum = sum.add(Z.valueOf(mS[pos - 1]).pow(mS[pos]));
        if (mMin == null || newSum.compareTo(mMin) < 0) {
          search(newSum, pos + 1);
        }
      }
      mS[k] = mS[pos];
      mS[pos] = t;
    }
  }

  @Override
  public Z next() {
    mS = new long[2 * ++mN];
    long p = 2;
    for (int k = 0; k < mS.length; ++k, p = mPrime.nextPrime(p)) {
      mS[k] = p;
    }
    mMin = null;
    if ((mN & 1) == 0) {
      // 2 must be a base in this case to ensure an odd result
      search(Z.ZERO, 1);
    } else {
      search(Z.ZERO, 0);
    }
    return mMin == null ? Z.NEG_ONE : mMin;
  }
}
