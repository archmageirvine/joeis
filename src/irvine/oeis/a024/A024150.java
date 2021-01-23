package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008454;

/**
 * A024150 a(n) = 12^n - n^10.
 * @author Sean A. Irvine
 */
public class A024150 extends A008454 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(12);
    return mA.subtract(super.next());
  }
}
