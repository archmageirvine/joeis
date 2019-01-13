package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006279.
 * @author Sean A. Irvine
 */
public class A006279 implements Sequence {

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
