package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025226 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1)</code> for <code>n &gt;= 2</code>. Also <code>a(n) = 3^n*C(n-1)</code>, where C <code>= A000108</code> (Catalan numbers). E.g., <code>a(3) = 3^3*C(2) = 27*2 = 54</code>.
 * @author Sean A. Irvine
 */
public class A025226 implements Sequence {

  private long mN = 0;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(2 * mN - 3).multiply(6).divide(mN);
    }
    return mA;
  }
}
