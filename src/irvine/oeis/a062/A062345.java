package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A062345 Length of period of continued fraction expansion of square root of 3^n-1.
 * @author Sean A. Irvine
 */
public class A062345 extends A003285 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(3);
    return period(mA.subtract(1));
  }
}
