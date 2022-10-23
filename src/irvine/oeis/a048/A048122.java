package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048122 a(1) = 1, a(2) = 2, a(n) = a(n-1)^3 - a(n-2)^3.
 * @author Sean A. Irvine
 */
public class A048122 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = mB.pow(3).subtract(mA.pow(3));
    mA = mB;
    mB = t;
    return mB;
  }
}
