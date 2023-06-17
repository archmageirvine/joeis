package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005048 Minimal span of set of n elements with no 4-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005048 extends AbstractSequence {

  /* Construct the sequence. */
  public A005048() {
    super(4);
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = getProgressionLength() - 1;
  private int mMin = 4;
  private long mBestIncluded = 0;
  private Collection<Long> mProgressions = null;

  private static Collection<Long> progressions(final int m, final int limit) {
    if (limit > 64) {
      throw new UnsupportedOperationException();
    }
    // Construct syndromes of all n element arithmetic progressions of m elements
    final ArrayList<Long> res = new ArrayList<>();
    final long q = m - 1;
    for (int firstElement = 1; firstElement <= limit - q; ++firstElement) {
      final long a = 1L << (firstElement - 1);
      for (int d = 1; d <= (limit - firstElement + q) / q; ++d) {
        long v = a;
        boolean ok = true;
        for (int j = 1; j < m; ++j) {
          final int bit = firstElement - 1 + d * j;
          if (bit > 63) {
            ok = false;
            break;
          }
          v |= 1L << bit;
        }
        if (ok) {
          assert (long) Long.bitCount(v) == m;
          res.add(v);
        }
      }
    }
    return res;
  }

  private void search(final long included, final int count, final int lastIndex) {
    if (count == mN) {
      if (lastIndex < mMin) {
        mMin = lastIndex;
        mBestIncluded = included;
      }
    }
    if (lastIndex + mN - count >= mMin) {
      return; // Will never beat current best
    }
    for (int p = lastIndex + 1; p <= mMin; ++p) {
      final long v = included + (1L << (p - 1));
      boolean ok = true;
      for (final long t : mProgressions) {
        if ((v & t) == t) {
          ok = false;
          break;
        }
      }
      if (ok) {
        // Recursively search
        search(v, count + 1, p);
      }
    }
  }

  private String printSet(final long included) {
    final StringBuilder sb = new StringBuilder("{");
    long v = included;
    int k = 1;
    while (v != 0) {
      if ((v & 1) == 1) {
        if (sb.length() > 1) {
          sb.append(", ");
        }
        sb.append(k);
      }
      v >>>= 1;
      ++k;
    }
    sb.append('}');
    return sb.toString();
  }

  protected int getProgressionLength() {
    return 4;
  }

  @Override
  public Z next() {
    ++mN;
    if (mMin > 50) {
      throw new UnsupportedOperationException();
    }
    mMin = Math.min(64, 2 * mMin);
    mProgressions = progressions(getProgressionLength(), mMin);
    search(0, 0, 0);
    if (mVerbose) {
      System.out.println("Solution: " + printSet(mBestIncluded));
    }
    return Z.valueOf(mMin - 1);
  }
}

