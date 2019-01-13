package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006479.
 * @author Sean A. Irvine
 */
public class A006479 extends A000045 {

  {
    super.next();
  }

  private Z mA = super.next();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z u = mA;
    mA = super.next();
    return mA.multiply(Z.FIVE.multiply(mN).subtract(23).multiply(mN).add(47)).subtract(u.multiply(11 * mN - 28)).subtract(75).divide(25);
  }
}
