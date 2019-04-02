package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005203 Fibonacci numbers (or rabbit sequence) converted to decimal.
 * @author Sean A. Irvine
 */
public class A005203 extends A000045 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (mB == null) {
      super.next();
      mB = Z.ONE;
    } else {
      final Z t = mB.shiftLeft(super.next().intValueExact()).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
