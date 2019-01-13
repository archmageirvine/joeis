package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000957;

/**
 * A001558.
 * @author Sean A. Irvine
 */
public class A001558 extends A000957 {

  {
    super.next();
    super.next();
  }

  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z mA = mB;
    mB = mC;
    mC = super.next();
    return mC.subtract(mB).subtract(mA);
  }
}
