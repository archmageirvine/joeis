package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001352 a(0) = 1, a(1) = 6, a(2) = 24; for n&gt;=3, a(n) = 4a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A001352 implements Sequence {

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
      mA = Z.SIX;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(24);
      return mB;
    }
    final Z t = mB.shiftLeft(2).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
