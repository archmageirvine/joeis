package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A024064 a(n) = 6^n - n^2.
 * @author Sean A. Irvine
 */
public class A024064 extends A000290 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(6);
    return mA.subtract(super.next());
  }
}
