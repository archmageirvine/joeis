package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A024026 a(n) = 3^n - n^3.
 * @author Sean A. Irvine
 */
public class A024026 extends A000578 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mA.subtract(super.next());
  }
}
