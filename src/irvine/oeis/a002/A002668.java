package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002668 Continued cotangent for e.
 * @author Sean A. Irvine
 */
public class A002668 implements Sequence {

  private CR mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = CR.E;
    } else {
      final CR floor = CR.valueOf(mB.floor(32));
      mB = mB.multiply(floor).add(CR.ONE).divide(mB.subtract(floor));
    }
    return mB.floor(32);
  }
}
