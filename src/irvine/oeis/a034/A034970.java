package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034970 a(n) is the greatest prime factor of a(n-2)*a(n-1)-1.
 * @author Sean A. Irvine
 */
public class A034970 implements Sequence {

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
    final Z lpf = Jaguar.factor(mA.multiply(mB).subtract(1)).largestPrimeFactor();
    mA = mB;
    mB = lpf;
    return lpf;
  }
}
