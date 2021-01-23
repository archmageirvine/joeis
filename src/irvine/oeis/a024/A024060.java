package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008455;

/**
 * A024060 a(n) = 5^n - n^11.
 * @author Sean A. Irvine
 */
public class A024060 extends A008455 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return mA.subtract(super.next());
  }
}
