package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003471;

/**
 * A007016.
 * @author Sean A. Irvine
 */
public class A007016 extends A003471 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z x = super.next();
    final Z res;
    if ((mN & 1) == 0) {
      res = x.subtract(mC.multiply(mN - 3)).multiply(mN);
    } else {
      res = mC.multiply(mN).multiply2().add(mB.multiply(mN - 1).multiply(3)).subtract(mA.multiply(mN - 1).multiply(mN - 3));
    }
    mA = mB;
    mB = mC;
    mC = x;
    return res.divide2();
  }
}
