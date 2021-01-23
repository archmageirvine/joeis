package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001016;

/**
 * A024148 a(n) = 12^n - n^8.
 * @author Sean A. Irvine
 */
public class A024148 extends A001016 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(12);
    return mA.subtract(super.next());
  }
}
