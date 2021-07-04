package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A048764 Largest factorial &lt;= n.
 * @author Sean A. Irvine
 */
public class A048764 extends A000142 {

  {
    super.next();
  }
  private Z mN = Z.ZERO;
  private Z mPrev = super.next();
  private Z mLim = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mLim)) {
      mPrev = mLim;
      mLim = super.next();
    }
    return mPrev;
  }
}
