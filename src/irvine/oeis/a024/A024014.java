package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000583;

/**
 * A024014 2^n-n^4.
 * @author Sean A. Irvine
 */
public class A024014 extends A000583 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return mA.subtract(super.next());
  }
}
