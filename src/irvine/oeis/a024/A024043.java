package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001015;

/**
 * A024043 a(n) = 4^n - n^7.
 * @author Sean A. Irvine
 */
public class A024043 extends A001015 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.shiftLeft(2);
    return mA.subtract(super.next());
  }
}
