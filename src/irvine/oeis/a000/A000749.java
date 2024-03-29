package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000749 a(n) = 4*a(n-1) - 6*a(n-2) + 4*a(n-3), n &gt; 3, with a(0)=a(1)=a(2)=0, a(3)=1.
 * @author Sean A. Irvine
 */
public class A000749 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (Z.ONE.equals(mA)) {
        mA = null;
        return Z.ZERO;
      }
      if (mA == null) {
        mA = Z.ZERO;
        return mA;
      }
      if (mB == null) {
        mB = Z.ZERO;
        return mB;
      }
      mC = Z.ONE;
      return mC;
    }
    final Z t = mC.shiftLeft(2).subtract(mB.multiply(6)).add(mA.shiftLeft(2));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
