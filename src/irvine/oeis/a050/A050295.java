package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050295 Number of strongly triple-free subsets of {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A050295 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;
  private boolean[] mForbidden = null;

  private void search(final int k) {
    ++mCount;
    for (int j = k + 1; j <= mN; ++j) {
      if (!mForbidden[j]) {
        if (2 * j > mN) {
          search(j);
        } else {
          final boolean a = mForbidden[2 * j];
          mForbidden[2 * j] = true;
          if (3 * j > mN) {
            search(j);
          } else {
            final boolean b = mForbidden[3 * j];
            mForbidden[3 * j] = true;
            search(j);
            mForbidden[3 * j] = b;
          }
          mForbidden[2 * j] = a;
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mForbidden = new boolean[mN + 1];
    mCount = 0;
    search(0);
    return Z.valueOf(mCount);
  }
}

