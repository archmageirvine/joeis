package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A073571.
 * @author Sean A. Irvine
 */
public class A073737 extends A065091 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z res = mA;
    mA = mB;
    mB = super.next().subtract(mA).subtract(res);
    return res;
  }
}
