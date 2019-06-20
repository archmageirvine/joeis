package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A024117 <code>a(n) = 10^n - n^3</code>.
 * @author Sean A. Irvine
 */
public class A024117 extends A000578 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA.subtract(super.next());
  }
}
