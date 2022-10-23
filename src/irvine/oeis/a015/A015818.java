package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015818 Number of solutions of +- 1 +- 2 +- ... +- (n-1) +- n = 0 in which the partial sums +- 1 +- ... +- k (1&lt;=k&lt;=n) are all distinct.
 * @author Sean A. Irvine
 */
public class A015818 extends Sequence0 {

  // Probably could save another factor of 2 here in time by symmetry

  private int mN = -1;
  private int mMax = 0;
  private boolean[] mSeen = null;
  private long mCount = 0;

  private void search(final int sum, final int k) {
    if (k > mN) {
      if (sum == mMax) {
        ++mCount;
      }
      return;
    }
    final int sp = sum + k;
    if (!mSeen[sp]) {
      mSeen[sp] = true;
      search(sp, k + 1);
      mSeen[sp] = false;
    }
    final int sm = sum - k;
    if (!mSeen[sm]) {
      mSeen[sm] = true;
      search(sm, k + 1);
      mSeen[sm] = false;
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mMax += mN;
    if ((mN & 3) == 1 || (mN & 3) == 2) {
      return Z.ZERO;
    }
    mCount = 0;
    mSeen = new boolean[2 * mMax + 1];
    search(mMax, 1);
    return Z.valueOf(mCount);
  }
}
