package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025231 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A025231 implements Sequence {

  private long mN = 0;
  private Z mA = Z.TWO;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    if (++mN < 3) {
      if (mN == 1) {
        return mA;
      }
    } else {
      final Z t = mB.multiply(8 * mN - 12).subtract(mA.multiply(4 * mN - 12)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
