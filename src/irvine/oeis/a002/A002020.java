package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002020 <code>a(n+1) = a(n) - n*(n-1)*a(n-1)</code>, with <code>a(n) = 1</code> for <code>n &lt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A002020 implements Sequence {

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
