package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A024116 <code>10^n-n^2</code>.
 * @author Sean A. Irvine
 */
public class A024116 extends A000290 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA.subtract(super.next());
  }
}
