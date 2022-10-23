package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006279 Denominators of convergents to Cahen's constant: a(n+2) = a(n)^2*a(n+1) + a(n).
 * @author Sean A. Irvine
 */
public class A006279 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
    } else {
      final Z t = mA.square().multiply(mB).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
