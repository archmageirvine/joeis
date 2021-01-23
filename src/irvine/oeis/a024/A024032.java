package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001017;

/**
 * A024032 a(n) = 3^n - n^9.
 * @author Sean A. Irvine
 */
public class A024032 extends A001017 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mA.subtract(super.next());
  }
}
