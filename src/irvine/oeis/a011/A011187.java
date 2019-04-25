package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A011187 Number of ways to choose <code>2^n</code> vectors in <code>{0, 1, 2, 3}^n</code> such that <code>any</code> two differ by at least 2 in at least one coordinate <code>(2^n</code> being maximal).
 * @author Sean A. Irvine
 */
public class A011187 implements Sequence {

  // Encode vectors using 2-bits per coordinate
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private int mN = 0;
  private long mLimit = 0;
  private long mCount = 0;
  private long[] mVectors = null;
  private String mPrefix = null;

  private boolean isDelta2(long u, long v) {
    while (u != v) {
      final long a = u & 3;
      final long b = v & 3;
      if (a - b >= 2 || b - a >= 2) {
        return true;
      }
      u >>>= 2;
      v >>>= 2;
    }
    return false;
  }

  private void dumpVectors() {
    final StringBuilder sb = new StringBuilder();
    for (final long v : mVectors) {
      if (sb.length() > 0) {
        sb.append(", ");
      }
      final String str = Long.toString(v, 4);
      if (str.length() < mN) {
        sb.append(mPrefix.substring(str.length()));
      }
      sb.append(str);
    }
    System.out.println(sb.toString());
  }

  private void search(final int pos) {
    if (pos == mVectors.length) {
      ++mCount;
      if (mVerbose) {
        dumpVectors();
      }
      return;
    }
    // Can assume vectors are lexicographically increasing
    for (long v = pos == 0 ? 0 : mVectors[pos - 1] + 1; v < mLimit; ++v) {
      boolean ok = true;
      for (int k = pos - 1; k >= 0; --k) {
        if (!isDelta2(mVectors[k], v)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mVectors[pos] = v;
        search(pos + 1);
      }
    }
  }

  @Override
  public Z next() {
    mLimit = 1L << (2 * ++mN);
    mCount = 0;
    mVectors = new long[1 << mN];
    mPrefix = StringUtils.rep('0', mN); // only used for verbose output
    search(0);
    return Z.valueOf(mCount);
  }

}

