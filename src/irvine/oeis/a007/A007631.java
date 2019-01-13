package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007631.
 * @author Sean A. Irvine
 */
public class A007631 implements Sequence {

  private int mN = -1;
  private long mCount = 0;

  private void search(final int k, final boolean[] used, final boolean[] seen) {
    if (k == mN + 1) {
      ++mCount;
      return;
    }
    for (int j = 1; j < used.length; ++j) {
      if (!used[j] && !seen[mN + j + k] && !seen[mN + j - k]) {
        used[j] = true;
        seen[mN + j + k] = true;
        seen[mN + j - k] = true;
        search(k + 1, used, seen);
        seen[mN + j - k] = false;
        seen[mN + j + k] = false;
        used[j] = false;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(1, new boolean[mN + 1], new boolean[3 * mN + 1]);
    return Z.valueOf(mCount);
  }

}
