package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395616 allocated for Noah Weninger.
 * @author Sean A. Irvine
 */
public class A395616 extends Sequence1 {

  // After Noah Weninger

  private int mN = 0;
  private long mCount;
  private int mM;
  private int[] mPi;
  private boolean[] mUsed;

  private void dfs(final int p) {
    if (p + 1 < mM) {
      mUsed[mPi[p]] = true;
      int t = (mPi[p] << 1) & (mM - 1);
      if (!mUsed[t]) {
        mPi[p + 1] = t;
        dfs(p + 1);
      }
      t = ((mPi[p] << 1) + 1) & (mM - 1);
      if (!mUsed[t]) {
        mPi[p + 1] = t;
        dfs(p + 1);
      }
      mUsed[mPi[p]] = false;
    } else {
      int len = 0;
      int q = p;
      do {
        q = mPi[q];
        ++len;
      } while (q != mM - 1);
      if (len == mM) {
        ++mCount;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mM = 1 << mN;
    mCount = 0;
    mPi = new int[mM];
    mUsed = new boolean[mM];
    for (int s = 0; s < mM; ++s) {
      mPi[0] = s;
      dfs(0);
    }
    return Z.valueOf(mCount);
  }
}
