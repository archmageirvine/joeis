package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A048765 Smallest factorial &gt;= n.
 * @author Sean A. Irvine
 */
public class A048765 extends A000142 {

  {
    super.next();
  }
  private Z mN = Z.ZERO;
  private Z mLim = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z res = mLim;
    if (mN.equals(mLim)) {
      mLim = super.next();
    }
    return res;
  }
}
