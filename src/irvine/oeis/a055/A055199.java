package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A055199 10^n-th decimal digit of Pi.
 * @author Sean A. Irvine
 */
public class A055199 extends A000796 {

  private long mLim = -1;
  private long mM = 0;

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
