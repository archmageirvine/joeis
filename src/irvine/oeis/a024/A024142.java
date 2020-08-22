package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A024142 12^n-n^2.
 * @author Sean A. Irvine
 */
public class A024142 extends A000290 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(12);
    return mA.subtract(super.next());
  }
}
