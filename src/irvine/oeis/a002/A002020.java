package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002020 a(n+1) = a(n) - n*(n-1)*a(n-1), with a(n) = 1 for n &lt;= 3.
 * @author Sean A. Irvine
 */
public class A002020 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 3) {
      final Z r = mB.subtract(mA.multiply(mN - 1).multiply(mN - 2));
      mA = mB;
      mB = r;
    }
    return mB;
  }
}
