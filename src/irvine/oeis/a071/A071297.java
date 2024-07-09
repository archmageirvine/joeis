package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a070.A070153;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071297 extends A070153 {

  private Z mT = super.next();
  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    long cnt = 0;
    while (mT.compareTo(mLim) <= 0) {
      ++cnt;
      mT = super.next();
    }
    return Z.valueOf(cnt);
  }
}
