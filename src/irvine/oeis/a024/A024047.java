package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008455;

/**
 * A024047 a(n) = 4^n - n^11.
 * @author Sean A. Irvine
 */
public class A024047 extends A008455 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.shiftLeft(2);
    return mA.subtract(super.next());
  }
}
