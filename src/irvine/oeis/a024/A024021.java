package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008455;

/**
 * A024021 2^n-n^11.
 * @author Sean A. Irvine
 */
public class A024021 extends A008455 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return mA.subtract(super.next());
  }
}
