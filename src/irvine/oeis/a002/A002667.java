package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002667 Continued cotangent for Pi.
 * @author Sean A. Irvine
 */
public class A002667 implements Sequence {

  private CR mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = CR.PI;
    } else {
      final CR floor = CR.valueOf(mB.floor());
      mB = mB.multiply(floor).add(CR.ONE).divide(mB.subtract(floor));
    }
    return mB.floor();
  }
}
