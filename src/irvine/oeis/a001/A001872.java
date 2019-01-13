package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001872.
 * @author Sean A. Irvine
 */
public class A001872 extends A000045 {

  {
    super.next();
  }

  private long mN = 0;
  private Z mB = super.next();

  @Override
  public Z next() {
    ++mN;
    final Z mA = mB;
    mB = super.next();
    return mA.multiply(mN + 1).multiply(3).add(mB.multiply(mN).shiftLeft(2)).multiply(mN + 2).multiply(mN + 4).divide(150);
  }
}
