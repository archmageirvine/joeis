package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010737 a(n) = 2*a(n-2) + 1.
 * @author Sean A. Irvine
 */
public class A010737 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.FOUR;
        return Z.FOUR;
      }
      mB = Z.SIX;
    } else {
      final Z t = mA.multiply2().add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

