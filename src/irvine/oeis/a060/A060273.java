package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A060273 Hard numbers: a(n) = smallest positive number m with f(m) = n, where f(m) is the smallest number of digits that are needed to construct m using only 1's, 2's and any number of +, -, *, ^ signs, allowing concatenation of the digits.
 * @author Sean A. Irvine
 */
public class A060273 extends Sequence1 {

  private static final int SWITCH_OVER_BITS = 32;

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final HashSet<Long> mBigSeen = new HashSet<>();
  private final List<TreeSet<Long>> mSets = new ArrayList<>();
  {
    mSets.add(null); // 0 not used
  }
  private int mN = 0;

  private boolean isSeen(final long value) {
    if (value < 0) {
      return true;
    }
    return value < 1L << SWITCH_OVER_BITS ? mSeen.isSet(value) : mBigSeen.contains(value);
  }

  private void mark(final long value) {
    if (value < 1L << SWITCH_OVER_BITS) {
      mSeen.set(value);
    } else {
      mBigSeen.add(value);
    }
  }

  private void check(final TreeSet<Long> s, final long v) {
    if (v > 0 && !isSeen(v)) {
      mark(v);
      s.add(v);
    }
  }

  @Override
  public Z next() {
    final TreeSet<Long> s = new TreeSet<>();
    mSets.add(s);
    if (++mN == 1) {
      check(s, 1);
      check(s, 2);
    } else {
      // First construct any possible concatenations not previously seen
      for (long digits = 0; digits < 1L << mN; ++digits) {
        long m = 0;
        long d = digits;
        for (int j = 0; j < mN; ++j) {
          m *= 10;
          m += (d & 1) == 0 ? 1 : 2;
          d >>>= 1;
        }
        check(s, m);
      }
      // Form new values from all possible previous pairings
      for (int k = 1; 2 * k <= mN; ++k) {
        for (final long a : mSets.get(k)) {
          for (final long b : mSets.get(mN - k)) {
            check(s, a + b);
            check(s, a - b);
            check(s, b - a);
            // The following steps take care to avoid overflows
            final Z product = Z.valueOf(a).multiply(b);
            if (product.bitLength() < 64) {
              check(s, product.longValue());
            }
            if (a > 1 && a < 64) {
              final Z pow = Z.valueOf(b).pow(a);
              if (pow.bitLength() < 64) {
                check(s, pow.longValue());
              }
            }
            if (b > 1 && b < 64) {
              final Z pow = Z.valueOf(a).pow(b);
              if (pow.bitLength() < 64) {
                check(s, pow.longValue());
              }
            }
          }
        }
      }
    }
    if (mVerbose) {
      StringUtils.message("n=" + mN + " generated " + s.size() + " new numbers");
    }
    return Z.valueOf(s.first());
  }
}
