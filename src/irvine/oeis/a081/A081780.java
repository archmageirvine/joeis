package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081780 Continued cotangent for square root of 3.
 * @author Sean A. Irvine
 */
public class A081780 extends Sequence0 {

  private CR mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = CR.THREE.sqrt();
    } else {
      final CR floor = CR.valueOf(mB.floor());
      mB = mB.multiply(floor).add(CR.ONE).divide(mB.subtract(floor));
    }
    return mB.floor();
  }
}
