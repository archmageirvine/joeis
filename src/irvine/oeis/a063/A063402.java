package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063402 a(0)=0; a(1)=1; a(2)=2; a(n)= a(n-1) + a(n-2)*a(n-3).
 * @author Sean A. Irvine
 */
public class A063402 extends Sequence0 {

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
      final Z t = mC.add(mA.multiply(mB));
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
