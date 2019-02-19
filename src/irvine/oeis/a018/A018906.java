package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018906.
 * @author Sean A. Irvine
 */
public class A018906 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return mA;
      }
      mB = Z.SIX;
    } else {
      final Z t = mB.square().divide(mA).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
