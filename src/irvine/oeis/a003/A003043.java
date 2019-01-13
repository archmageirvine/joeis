package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003043.
 * @author Sean A. Irvine
 */
public class A003043 implements Sequence {

  private int mN = 0;
  private long mCount = 0;

  protected boolean filter(final int lastUsed) {
    return true;
  }

  private void search(final boolean[] used, final int lastUsed, final int countUsed) {
    if (countUsed == used.length) {
      if (filter(lastUsed)) {
        ++mCount;
      }
    } else {
      for (int k = 0, j = 1; k < mN; ++k, j <<= 1) {
        final int c = lastUsed ^ j;
        if (!used[c]) {
          used[c] = true;
          search(used, c, countUsed + 1);
          used[c] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final boolean[] used = new boolean[1 << mN];
    used[0] = true;
    used[1] = true;
    search(used, 1, 2);
    return Z.valueOf(mCount).multiply(mN);
  }
}
