package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081738 a(n) = Sum_{2 &lt;= p &lt;= n, p prime} p^2.
 * @author Sean A. Irvine
 */
public class A081738 extends A000040 {

  private Z mP = super.next();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (mP.equals(++mN)) {
      mSum = mSum.add(mP.square());
      mP = super.next();
    }
    return mSum;
  }
}
