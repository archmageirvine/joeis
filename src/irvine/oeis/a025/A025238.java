package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025238 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-2)*a(2) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A025238 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.THREE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 3) {
      if (mN == 1) {
        return mA;
      }
    } else {
      final Z t = mB.multiply(6 * mN - 9).subtract(mA.multiply(5 * mN - 15)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
