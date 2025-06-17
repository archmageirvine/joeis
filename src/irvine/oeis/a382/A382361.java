package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382361 allocated for Amya Luo.
 * @author Sean A. Irvine
 */
public class A382361 extends Sequence1 {

  private int mN = 0;
  private int[] mP = null;
  private int[] mUsed = null;
  private long mCount = 0;

  private boolean is(final int pos) {
    if (mUsed[mP[pos]] == 2) {
      // Check nesting
      int k = 0;
      while (mP[k] != mP[pos]) {
        ++k;
      }
      assert k < pos;
      for (int j = k + 1; j < pos - 1; ++j) {
        if (mUsed[mP[j]] == 2) {
          for (int i = j + 1; i < pos; ++i) {
            if (mP[i] == mP[j]) {
              return false;
            }
          }
        }
      }
    }
    // Check 123 avoidance
    for (int a = 0; a < pos - 1; ++a) {
      for (int b = a + 1; b < pos; ++b) {
        if (mP[a] < mP[b] && mP[b] < mP[pos]) {
          return false;
        }
      }
    }
    return true;
  }

  private void search(final int pos) {
    if (pos == mP.length) {
      ++mCount;
      return;
    }
    for (int v = 0; v < mN; ++v) {
      if (mUsed[v] != 2) {
        mP[pos] = v;
        ++mUsed[v];
        if (is(pos)) {
          search(pos + 1);
        }
        --mUsed[v];
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mUsed = new int[mN];
    mP = new int[2 * mN];
    mCount = 0;
    search(0);
    return Z.valueOf(mCount);
  }
}

