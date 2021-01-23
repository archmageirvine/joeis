package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000583;

/**
 * A024118 a(n) = 10^n - n^4.
 * @author Sean A. Irvine
 */
public class A024118 extends A000583 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA.subtract(super.next());
  }
}
