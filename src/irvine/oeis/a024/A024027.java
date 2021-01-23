package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000583;

/**
 * A024027 a(n) = 3^n - n^4.
 * @author Sean A. Irvine
 */
public class A024027 extends A000583 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mA.subtract(super.next());
  }
}
