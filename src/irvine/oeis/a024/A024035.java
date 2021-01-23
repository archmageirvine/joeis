package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008456;

/**
 * A024035 a(n) = 3^n - n^12.
 * @author Sean A. Irvine
 */
public class A024035 extends A008456 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mA.subtract(super.next());
  }
}
