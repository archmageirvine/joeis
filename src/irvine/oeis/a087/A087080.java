package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087080 Number of elements in the coprime subsets of the integers 1 to n.
 * @author Sean A. Irvine
 */
public class A087080 extends Sequence0 {

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
      for (int j = k + 1; j <= mN; ++j) {
        if (Functions.GCD.i(j, k) != 1) {
          ++mForbidden[j];
        }
      }
      search(k + 1, count + 1); // include k
      for (int j = k + 1; j <= mN; ++j) {
        if (Functions.GCD.i(j, k) != 1) {
          --mForbidden[j];
        }
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

