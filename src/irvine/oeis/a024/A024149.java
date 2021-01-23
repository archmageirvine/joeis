package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001017;

/**
 * A024149 a(n) = 12^n - n^9.
 * @author Sean A. Irvine
 */
public class A024149 extends A001017 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(12);
    return mA.subtract(super.next());
  }
}
