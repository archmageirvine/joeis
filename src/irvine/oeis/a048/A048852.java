package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048852 Difference between b^2 (in c^2=a^2+b^2) and product of successive prime pairs.
 * @author Sean A. Irvine
 */
public class A048852 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t == null ? Z.ZERO : mA.subtract(t).multiply(mA);
  }
}
