package irvine.oeis.a392;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A392517 a(n) is the minimum diameter of a n-element set of integers for which no nonzero d has more than d-1 representations as a difference of elements of the set.
 * @author Sean A. Irvine
 */
public class A392517 extends Sequence1 {

  // After Aditya A Gupta

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int[] mSet = null;
  private int[] mDiffCounts = null;

  private boolean backtrack(final int size, final int m, final int limit, final int startVal) {
    if (size == m) {
      if (mVerbose) {
        StringUtils.message(Arrays.toString(mSet));
      }
      return true;
    }
    for (int v = startVal; v <= limit; ++v) {
      boolean ok = true;

      // Check constraints
      for (int i = 0; i < size; ++i) {
        final int d = v - mSet[i];
        if (mDiffCounts[d] + 1 > d - 1) {
          ok = false;
          break;
        }
      }
      if (!ok) {
        continue;
      }

      // Apply updates
      for (int i = 0; i < size; ++i) {
        final int d = v - mSet[i];
        ++mDiffCounts[d];
      }

      mSet[size] = v;

      if (backtrack(size + 1, m, limit, v + 1)) {
        return true;
      }

      // Undo updates
      for (int i = 0; i < size; ++i) {
        final int d = v - mSet[i];
        --mDiffCounts[d];
      }
    }

    return false;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    // Find optimal diameter
    for (int limit = 0; limit < mN * mN; ++limit) {
      mSet = new int[mN];
      mDiffCounts = new int[limit + 1];
      if (backtrack(1, mN, limit, 1)) {
        return Z.valueOf(limit);
      }
    }
    throw new RuntimeException("failed to find a solution < " + mN * mN);
  }
}
