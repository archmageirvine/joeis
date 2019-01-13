package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A007854.
 * @author Sean A. Irvine
 */
public class A007854 extends A000108 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(9).subtract(super.next().multiply(3)).divide2();
    return mA;
  }
}
