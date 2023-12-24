package irvine.oeis.a367;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A367537.
 * @author Sean A. Irvine
 */
public class A367537 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long mCount;
  private int[] mPerm;

  private void search(final int pos, final long used) {
    if (pos == mPerm.length) {
      ++mCount;
      return;
    }
    long j = 1;
    for (int k = 0; k < mN; ++k, j <<= 1) {
      if (k != pos && k != pos + mM && k != pos - mM && (used & j) == 0 && (k > pos || mPerm[k] != pos)) {
        mPerm[pos] = k;
        search(pos + 1, used | j);
      }
    }
  }

  @Override
  public Z next() {
    ++mM;
    mN += 2;
    if (mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mCount = 0;
    mPerm = new int[mN];
    search(0, 0L);
    return Z.valueOf(mCount);
  }
}

