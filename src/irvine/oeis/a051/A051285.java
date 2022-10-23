package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051285 a(1) = 1, a(2) = 2, a(n) = a(n-1)^a(n-2).
 * @author Sean A. Irvine
 */
public class A051285 extends Sequence1 {

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
    final Z t = mB.pow(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
