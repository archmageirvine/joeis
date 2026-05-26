package irvine.oeis.a393;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A393905 Square array read by antidiagonals: optimal diameter of g-Golomb Ruler of multiplicity n and length n+k, for k&gt;=1.
 * @author Sean A. Irvine
 */
public class A393905 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;
  private int[] mSet = null;
  private int[] mDiffCounts = null;

  private boolean backtrack(final int reps, final int size, final int m, final int limit, final int startVal) {
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
        if (mDiffCounts[d] + 1 > reps) {
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

      if (backtrack(reps, size + 1, m, limit, v + 1)) {
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

  protected Z t(final int n, final int m) {
    if (m <= 1) {
      return Z.ZERO;
    }
    // Find optimal diameter
    for (int limit = 0; limit < m * m; ++limit) {
      mSet = new int[m];
      mDiffCounts = new int[limit + 1];
      if (backtrack(n, 1, m, limit, 1)) {
        return Z.valueOf(limit);
      }
    }
    throw new RuntimeException("failed to find a solution < " + m * m);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN + 1);
  }
}
