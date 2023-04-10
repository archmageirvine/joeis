package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A062761 Number of powerful numbers between 2^(n-1)+1 and 2^n.
 * @author Sean A. Irvine
 */
public class A062761 extends A001694 {

  private Z mA = super.next();
  private Z mLim = null;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    long cnt = 0;
    while (mA.compareTo(mLim) <= 0) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}

