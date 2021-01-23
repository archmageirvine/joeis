package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008456;

/**
 * A024074 a(n) = 6^n - n^12.
 * @author Sean A. Irvine
 */
public class A024074 extends A008456 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(6);
    return mA.subtract(super.next());
  }
}
