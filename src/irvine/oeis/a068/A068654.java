package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068654 Prime numbers such that every cyclic permutation (other than the number itself) is composite.
 * @author Sean A. Irvine
 */
public class A068654 extends A000040 {

  private Z mMul = Z.ONE;
  private Z mLim = Z.TEN;
  private int mShifts = 0;
  {
    super.skip(4); // 2..7
  }

  private boolean is(Z n, final int m) {
    for (int k = 0; k < m; ++k) {
      // Cannot use ZUtils.rotateRight here because of difficulty with 0s
      n = n.divide(10).add(mMul.multiply(n.mod(10)));
      if (n.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.compareTo(mLim) >= 0) {
        mMul = mLim;
        mLim = mLim.multiply(10);
        ++mShifts;
      }
      if (is(c, mShifts)) {
        return c;
      }
    }
  }
}
