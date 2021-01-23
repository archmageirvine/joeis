package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001014;

/**
 * A024042 a(n) = 4^n - n^6.
 * @author Sean A. Irvine
 */
public class A024042 extends A001014 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.shiftLeft(2);
    return mA.subtract(super.next());
  }
}
