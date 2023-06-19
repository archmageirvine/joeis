package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a006.A006720;

/**
 * A064185 a(n) = (b(n+3) * b(n-1) * a(n-1)^2 - 1) / b(n+2) where b(n) = A006720(n).
 * @author Sean A. Irvine
 */
public class A064185 extends A006720 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();
  private Z mT = null;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
      return Z.ONE;
    }
    final Z u = mA;
    mA = mB;
    mB = mC;
    mC = mD;
    mD = super.next();
    mT = mD.multiply(u).multiply(mT.square()).subtract(1).divide(mC);
    return mT;
  }
}
