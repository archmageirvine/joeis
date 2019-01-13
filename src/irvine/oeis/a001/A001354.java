package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001354.
 * @author Sean A. Irvine
 */
public class A001354 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null && mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    if (mA == null) {
      mB = null;
      mA = Z.SEVEN;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(21);
      return mB;
    }
    final Z t = mB.multiply(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
