package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010098.
 * @author Sean A. Irvine
 */
public class A010098 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.THREE;
    } else {
      final Z t = mA.multiply(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

