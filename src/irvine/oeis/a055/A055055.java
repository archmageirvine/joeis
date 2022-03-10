package irvine.oeis.a055;

import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A055055 Number of basic magic carpets on n points.
 * @author Sean A. Irvine
 */
public class A055055 implements Sequence {

  // Too slow for more than 2 or 3 terms

  // The following is the limit of the largest number of sets in any basic magic carpet of 1..n
  // This can easily be extended, but the search here will never exhaust this in a reasonable time
  static final int[] LARGEST_K = {0, 0, 0, 0, 0, 3, 5, 8, 14, 23, 40, 70}; // A025591
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected int mN = 4;
  private long mCount = 0;

  private int sum(final long set) {
    long m = set;
    int sum = 0;
    int k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        sum += k;
      }
      ++k;
      m >>>= 1;
    }
    return sum;
  }

  private String toString(final long set) {
    final StringBuilder sb = new StringBuilder();
    long m = set;
    int k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        sb.append(k);
      }
      ++k;
      m >>>= 1;
    }
    return sb.toString();
  }

  private boolean isOrderOk(final long[] sets) {
    for (int k = 1; k < sets.length; ++k) {
      if (sets[k] < sets[k - 1]) {
        return false;
      }
    }
    return true;
  }

  protected boolean isAccept(final int n, final long[] sets) {
    // Check for constant sum
    final int s = sum(sets[0]);
    for (int k = 1; k < sets.length; ++k) {
      if (sets[k] == sets[k - 1] || sum(sets[k]) != s) {
        return false; // not a carpet
      }
    }
    return true;
  }

  private String toString(final long[] sets) {
    final StringBuilder sb = new StringBuilder();
    for (final long s : sets) {
      if (sb.length() > 0) {
        sb.append(", ");
      }
      sb.append(toString(s));
    }
    return sb.toString();
  }

  private boolean isCanon(final int n, final long[] sets) {
    final Permutation perm = new Permutation(n);
    final long[] work = new long[sets.length];
    perm.next(); // skip identity
    int[] p; // 0..n-1
    while ((p = perm.next()) != null) {
      Arrays.fill(work, 0);
      for (int k = 0; k < sets.length; ++k) {
        long s = sets[k];
        int j = 0;
        while (s != 0) {
          if ((s & 1) == 1) {
            work[k] |= 1L << p[j];
          }
          s >>>= 1;
          ++j;
        }
      }
      Arrays.sort(work);
      if (isAccept(n, work)) {
        if (LongUtils.compare(sets, work) > 0) {
          return false;
        }
      }
    }
    return true;
  }

  private void search(final int n, final int t, final long[] sets) {
    if (t <= 0) {
      if (!isAccept(n, sets)) {
        return;
      }
      if (!isCanon(n, sets)) {
        return;
      }
      if (mVerbose) {
        StringUtils.message(sum(sets[0]) + ": " + toString(sets));
      }
      ++mCount;
      return;
    }
    final int b = t - 1;
    for (int d = 3; d < 1 << sets.length; ++d) {
      // d controls which sets t will be placed into
      if (Integer.bitCount(d) > 1) {
        for (int k = 0; k < sets.length; ++k) {
          if ((d & (1 << k)) != 0) {
            sets[k] |= 1L << b;
          }
        }
        if (isOrderOk(sets)) {
          search(n, b, sets);
        }
        for (int k = 0; k < sets.length; ++k) {
          if ((d & (1 << k)) != 0) {
            sets[k] &= ~(1L << b);
          }
        }
      }
    }
  }

  protected long b(final int n, final int k) {
    mCount = 0;
    search(n, n, new long[k]);
    if (mVerbose) {
      StringUtils.message("B(" + n + "," + k + ")=" + mCount);
    }
    return mCount;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int m = 3; m <= LARGEST_K[mN]; ++m) {
      sum = sum.add(b(mN, m));
    }
    return sum;
  }
}
