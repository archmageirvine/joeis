package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087081 Sum of the elements in the coprime subsets of the integers 1 to n.
 * @author Sean A. Irvine
 */
public class A087081 extends Sequence0 {

  private int mN = -1;
  private Z mTotalSum = Z.ZERO;
  private int[] mForbidden;

  private void search(final int k, final int sum) {
    if (k > mN) {
      mTotalSum = mTotalSum.add(sum);
      return;
    }
    search(k + 1, sum); // do not include k
    if (mForbidden[k] == 0) {
      for (int j = k + 1; j <= mN; ++j) {
        if (Functions.GCD.i(j, k) != 1) {
          ++mForbidden[j];
        }
      }
      search(k + 1, sum + k); // include k
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
    mTotalSum = Z.ZERO;
    search(1, 0);
    return mTotalSum;
  }
}

