package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079465.
 * @author Sean A. Irvine
 */
public class A079480 extends Sequence1 {

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
      return Z.TWO;
    }
    final Z t = Functions.LOOK_AND_SAY.z(mA).add(Functions.LOOK_AND_SAY.z(mB));
    mA = mB;
    mB = t;
    return t;
  }
}
