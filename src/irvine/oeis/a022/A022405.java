package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022405 a(n) = a(n-1)*a(n-2) - a(n-3), with a(1) = 0, a(2) = 1, a(3) = 2.
 * @author Sean A. Irvine
 */
public class A022405 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      if (mB == null) {
        mB = Z.ONE;
        return Z.ONE;
      }
      mC = Z.TWO;
    } else {
     final Z t = mB.multiply(mC).subtract(mA);
     mA = mB;
     mB = mC;
     mC = t;
    }
    return mC;
  }
}
