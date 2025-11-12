package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081794 Continued cotangent for Pi/4.
 * @author Sean A. Irvine
 */
public class A081794 extends Sequence0 {

  private CR mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = CR.PI.divide(4);
    } else {
      final CR floor = CR.valueOf(mB.floor());
      mB = mB.multiply(floor).add(CR.ONE).divide(mB.subtract(floor));
    }
    return mB.floor();
  }
}
