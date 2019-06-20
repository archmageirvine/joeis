package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008454;

/**
 * A024111 <code>a(n) = 9^n - n^10</code>.
 * @author Sean A. Irvine
 */
public class A024111 extends A008454 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(9);
    return mA.subtract(super.next());
  }
}
