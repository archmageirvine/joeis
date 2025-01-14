package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005907 a(n) = floor(tau*a(n-2)) + a(n-1) with a(0)=1 and a(1)=3.
 * @author Sean A. Irvine
 */
public class A005907 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.THREE;
    } else {
      final Z t = CR.PHI.multiply(mA).floor().add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
