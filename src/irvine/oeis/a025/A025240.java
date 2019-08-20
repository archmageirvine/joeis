package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025240 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-2)*a(2)</code> for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A025240 implements Sequence {

  private long mN = 0;
  private Z mA = Z.THREE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN < 3) {
      if (mN == 1) {
        return mA;
      }
    } else {
      final Z t = mB.multiply(6 * mN - 9).subtract(mA.multiply(mN - 3)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
