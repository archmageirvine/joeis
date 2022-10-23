package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048634 a(n) = a(n-1)*a(n-3) + a(n-2), with a(0)=a(1)=0 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A048634 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return mA;
      }
      if (mB == null) {
        mB = Z.ZERO;
        return mB;
      }
      mC = Z.ONE;
    } else {
      final Z t = mA.multiply(mC).add(mB);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
