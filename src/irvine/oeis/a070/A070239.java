package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070224.
 * @author Sean A. Irvine
 */
public class A070239 extends Sequence1 {

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
      final Z t = Functions.SIGMA.z(mA.longValueExact(), mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

