package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001017;

/**
 * A024136 a(n) = 11^n - n^9.
 * @author Sean A. Irvine
 */
public class A024136 extends A001017 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(11);
    return mA.subtract(super.next());
  }
}
