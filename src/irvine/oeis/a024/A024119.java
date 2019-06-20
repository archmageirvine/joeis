package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000584;

/**
 * A024119 <code>a(n) = 10^n - n^5</code>.
 * @author Sean A. Irvine
 */
public class A024119 extends A000584 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA.subtract(super.next());
  }
}
