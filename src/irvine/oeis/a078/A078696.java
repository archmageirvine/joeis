package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078691.
 * @author Sean A. Irvine
 */
public class A078696 extends Sequence1 {

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
      return Z.ONE;
    }
    final Z t = mA.isOdd() ? mA.add(mB) : mB.add(mA.divide2());
    mA = mB;
    mB = t;
    return t;
  }
}

