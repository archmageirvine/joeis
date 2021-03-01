package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007654 Numbers k such that the standard deviation of 1,...,k is an integer.
 * @author Sean A. Irvine
 */
public class A007654 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.THREE;
    } else {
      final Z t = mB.multiply(14).subtract(mA).add(6);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
