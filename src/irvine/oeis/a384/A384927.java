package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384927 a(n) is the maximum size of a subset S of {1, 2, ..., n} such that for any distinct elements a, b in S, a + b does not divide a*b.
 * @author Sean A. Irvine
 */
public class A384927 extends Sequence1 {

  private int mN = 0;
  private int mMaxSize = 0;
  private int[] mSet = null;

  private boolean isOk(final int pos, final int v) {
    for (int k = 0; k < pos; ++k) {
      if ((mSet[k] * v) % (mSet[k] + v) == 0) {
        return false;
      }
    }
    return true;
  }

  private void search(final int pos, final int next) {
    if (pos > mMaxSize) {
      mMaxSize = pos;
    }
    if (next > mN) {
      return;
    }
    if (mN - next < mMaxSize - pos) {
      return;
    }
    for (int v = next; v <= mN; ++v) {
      if (isOk(pos, v)) {
        mSet[pos] = v;
        search(pos + 1, v + 1);
      }
    }
  }

  @Override
  public Z next() {
    mSet = new int[++mN];
    search(0, 1);
    return Z.valueOf(mMaxSize);
  }
}
