package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024168 a(n) = n!*(1/2 - 1/3 + ... + c/n), where c = (-1)^n.
 * @author Sean A. Irvine
 */
public class A024168 extends Sequence1 {

  private long mN = 1;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = mA.multiply(++mN).multiply(mN).add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
