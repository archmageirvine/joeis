package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000292;

/**
 * A014306 a(n) = 0 if n of form m(m+1)(m+2)/6, otherwise 1.
 * @author Sean A. Irvine
 */
public class A014306 extends A000292 {

  private Z mA = super.next();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mA.equals(mN)) {
      mA = super.next();
      return Z.ZERO;
    }
    return Z.ONE;
  }
}

