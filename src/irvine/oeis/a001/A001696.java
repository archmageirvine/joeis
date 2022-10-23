package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001696 a(n) = a(n-1)*(1 + a(n-1) - a(n-2)), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A001696 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return mA;
    }
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mB.add(1).subtract(mA).multiply(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
