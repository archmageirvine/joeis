package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081792 Continued cotangent for cosh(1).
 * @author Sean A. Irvine
 */
public class A081792 extends Sequence0 {

  private CR mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = CR.ONE.cosh();
    } else {
      final CR floor = CR.valueOf(mB.floor());
      mB = mB.multiply(floor).add(CR.ONE).divide(mB.subtract(floor));
    }
    return mB.floor();
  }
}
