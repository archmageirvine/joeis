package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a033.A033502;

/**
 * A036060 Number of 3-component Carmichael numbers C = (6M + 1)(12M + 1)(18M + 1) &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A036060 extends A033502 {

  private Z mA = super.next();
  private Z mLim = Z.valueOf(1000);
  private long mCnt = 0;

  @Override
  public Z next() {
    while (mA.compareTo(mLim) < 0) {
      ++mCnt;
      mA = super.next();
    }
    mLim = mLim.multiply(10);
    return Z.valueOf(mCnt);
  }
}
