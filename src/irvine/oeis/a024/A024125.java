package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008455;

/**
 * A024125 a(n) = 10^n - n^11.
 * @author Sean A. Irvine
 */
public class A024125 extends A008455 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA.subtract(super.next());
  }
}
