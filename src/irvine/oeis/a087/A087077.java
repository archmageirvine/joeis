package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087077 Total number of elements in all primitive subsets of the integers 1 to n.
 * @author Sean A. Irvine
 */
public class A087077 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;
  private int[] mForbidden;

  private void search(final int k, final int count) {
    if (k > mN) {
      mCount += count;
      return;
    }
    search(k + 1, count); // do not include k
    if (mForbidden[k] == 0) {
      for (int j = 2 * k; j <= mN; j += k) {
        ++mForbidden[j];
      }
      search(k + 1, count + 1); // include k
      for (int j = 2 * k; j <= mN; j += k) {
        --mForbidden[j];
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mForbidden = new int[mN + 1];
    mCount = 0;
    search(1, 0);
    return Z.valueOf(mCount);
  }
}

