package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008454;

/**
 * A024124 a(n) = 10^n - n^10.
 * @author Sean A. Irvine
 */
public class A024124 extends A008454 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA.subtract(super.next());
  }
}
