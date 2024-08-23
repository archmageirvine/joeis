package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a005.A005574;

/**
 * A071868 Number of k (1 &lt;= k &lt;= n) such that k^2+1 is prime.
 * @author Sean A. Irvine
 */
public class A071868 extends A005574 {

  private long mN = 0;
  private long mA = super.next().longValueExact();
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mA) {
      mCount = mCount.add(1);
      mA = super.next().longValueExact();
    }
    return mCount;
  }
}
