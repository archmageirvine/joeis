package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000930;

/**
 * A005204 Coding a recurrence.
 * @author Sean A. Irvine
 */
public class A005204 extends A000930 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private boolean mFirstNonZero = false;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (mB == null) {
      mB = Z.ZERO;
      return Z.ZERO;
    }
    if (mC == null) {
      mC = Z.ZERO;
    } else if (!mFirstNonZero) {
      mC = Z.ONE;
      mFirstNonZero = true;
    } else {
      final Z t = mC.shiftLeft(super.next().longValueExact()).add(mA);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
