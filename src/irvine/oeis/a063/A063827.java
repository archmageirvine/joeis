package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063827 a(n) = round(sqrt(a(n-2)^2 + a(n-1)^2)) with a(0) = 1 and a(1) = 2.
 * @author Sean A. Irvine
 */
public class A063827 extends Sequence0 {

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
    } else {
      final Z t = CR.valueOf(mA.square().add(mB.square())).sqrt().round();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
