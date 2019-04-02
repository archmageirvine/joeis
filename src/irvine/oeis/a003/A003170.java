package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000573;

/**
 * A003170 Number of 4 X n Latin rectangles in which the first row is in order.
 * @author Sean A. Irvine
 */
public class A003170 extends A000573 {

  private Z mF = Z.TWO;

  @Override
  public Z next() {
    final Z t = super.next();
    mF = mF.divide(mN > 4 ? mN - 4 : 1).multiply(mN - 1);
    return t.multiply(mF);
  }
}
