package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A039932 Smallest number k for which k, 2k, ... nk all contain the digit 1.
 * @author Sean A. Irvine
 */
public class A039932 extends Sequence1 {

  private Z mPrev = Z.ZERO;
  private int mN = 0;

  protected int digit() {
    return 1;
  }

  private boolean isOk(final Z m, final int n) {
    for (int k = 1; k <= n; ++k) {
      if (ZUtils.digitCounts(m.multiply(k))[digit()] == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    if (ZUtils.digitCounts(mPrev.multiply(mN))[digit()] == 0) {
      // We need a bigger value
      do {
        mPrev = mPrev.add(1);
      } while (!isOk(mPrev, mN));
    }
    return mPrev;
  }
}
