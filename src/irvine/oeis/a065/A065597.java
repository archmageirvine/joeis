package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065597 a(0)=0, a(1)=1, a(2)=1; for n &gt;= 3, a(n) = 2*a(n-1)*a(n-2) - a(n-3).
 * @author Sean A. Irvine
 */
public class A065597 extends Sequence0 {

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
      mC = Z.ONE;
      return Z.ONE;
    }
    final Z t = mC.multiply(mB).multiply2().subtract(mA);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

