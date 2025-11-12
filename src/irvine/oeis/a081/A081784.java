package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081784 Continued cotangent for zeta(3).
 * @author Sean A. Irvine
 */
public class A081784 extends Sequence0 {

  private CR mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Zeta.zeta(3);
    } else {
      final CR floor = CR.valueOf(mB.floor());
      mB = mB.multiply(floor).add(CR.ONE).divide(mB.subtract(floor));
    }
    return mB.floor();
  }
}
