package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a046.A046117;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080841 extends A046117 {

  private Z mA = super.next();
  private Z mLim = Z.ONE;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    while (mA.compareTo(mLim) < 0) {
      ++mCount;
      mA = super.next();
    }
    return Z.valueOf(mCount);
  }
}

