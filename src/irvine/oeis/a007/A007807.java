package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007807.
 * @author Sean A. Irvine
 */
public class A007807 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mB.multiply(mA.add(1));
      mA = mB;
      mB = t;
    }
    return mB.subtract(1);
  }
}
