package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A055200 a(-1) = 2; for n &gt;= 0, a(n) is the 10^n-th digit of e after the decimal point.
 * @author Sean A. Irvine
 */
public class A055200 extends A001113 {

  private long mLim = -1;
  private long mM = 0;

  {
    setOffset(-1);
  }

  @Override
  public Z next() {
    if (mLim < 0) {
      mLim = 0;
      return super.next();
    }
    mLim = mLim == 0 ? 1 : mLim * 10;
    while (++mM < mLim) {
      super.next();
    }
    return super.next();
  }
}
