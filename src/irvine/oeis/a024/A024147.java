package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001015;

/**
 * A024147 a(n) = 12^n - n^7.
 * @author Sean A. Irvine
 */
public class A024147 extends A001015 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(12);
    return mA.subtract(super.next());
  }
}
