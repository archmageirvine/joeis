package irvine.oeis.a395;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A395265 a(n) is the minimum diameter of an n-element set of integers for which no nonzero d has more than 5 representations as a difference of elements of the set.
 * @author Sean A. Irvine
 */
public class A395265 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final int mReps;
  private int mN = 0;
  private int[] mSet = null;
  private int[] mDiffCounts = null;

  protected A395265(final int reps) {
    mReps = reps;
  }

  /** Construct the sequence. */
  public A395265() {
    this(5);
  }

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
        if (mDiffCounts[d] + 1 > mReps) {
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
