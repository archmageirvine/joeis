package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034970 a(n) is the greatest prime factor of a(n-2)*a(n-1)-1.
 * @author Sean A. Irvine
 */
public class A034970 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      } else {
        mB = Z.THREE;
        return Z.THREE;
      }
    }
    final Z lpf = Functions.GPF.z(mA.multiply(mB).subtract(1));
    mA = mB;
    mB = lpf;
    return lpf;
  }
}
