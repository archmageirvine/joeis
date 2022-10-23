package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025239 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-2)*a(2) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A025239 extends Sequence1 {

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
      final Z t = mB.multiply(4 * mN - 6).add(mA.multiply(8 * mN - 24)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
