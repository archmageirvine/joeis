package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048634 a(n)=a(n-1)*a(n-3)+a(n-2).
 * @author Sean A. Irvine
 */
public class A048634 implements Sequence {

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
