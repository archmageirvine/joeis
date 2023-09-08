package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065640.
 * @author Sean A. Irvine
 */
public class A065653 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return mA;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA.square().add(2);
    mA = mB;
    mB = t;
    return t;
  }
}
