package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000584;

/**
 * A024093 <code>a(n) = 8^n - n^5</code>.
 * @author Sean A. Irvine
 */
public class A024093 extends A000584 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(8);
    return mA.subtract(super.next());
  }
}
