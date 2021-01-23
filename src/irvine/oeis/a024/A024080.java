package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000584;

/**
 * A024080 a(n) = 7^n - n^5.
 * @author Sean A. Irvine
 */
public class A024080 extends A000584 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(7);
    return mA.subtract(super.next());
  }
}
