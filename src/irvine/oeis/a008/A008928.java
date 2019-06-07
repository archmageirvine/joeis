package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008928 Number of increasing sequences of addition chain type with maximal element <code>n</code>.
 * @author Sean A. Irvine
 */
public class A008928 implements Sequence {

  // After Don Reble (but with array orientation reversed)

  private long[] mCounts = {0, 1};
  private int mN = 0;
  private int mMax = 1;

  protected static boolean contains(final int[] chain, final int pos, final int value) {
    for (int k = 0; k <= pos; ++k) {
      final int elem = chain[k];
      if (elem == value) {
        return true;
      }
      if (elem > value) {
        return false; // sorted
      }
    }
    return false;
  }

  protected static boolean isExtendable(final int[] chain, final int pos, final int next) {
    for (int k = 0; k <= pos; ++k) {
      if (contains(chain, pos, next - chain[k])) {
        return true;
      }
    }
    return false;
  }

  protected void search(final int[] chain, final int pos) {
    // Search all chains up to max
    final int last = chain[pos];
    ++mCounts[last];
    for (int next = last + 1; next <= mMax; ++next) {
      if (isExtendable(chain, pos, next)) {
        chain[pos + 1] = next;
        search(chain, pos + 1);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > mMax) {
      mMax *= 2;
      mCounts = new long[mMax + 1];
      final int[] chain = new int[mMax];
      chain[0] = 1;
      search(chain, 0);
    }
    return Z.valueOf(mCounts[mN]);
  }
}
