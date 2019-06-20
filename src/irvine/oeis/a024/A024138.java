package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008455;

/**
 * A024138 <code>a(n) = 11^n - n^11</code>.
 * @author Sean A. Irvine
 */
public class A024138 extends A008455 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(11);
    return mA.subtract(super.next());
  }
}
