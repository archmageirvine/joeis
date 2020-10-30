package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a246.A246547;

/**
 * A036386 Number of prime powers (p^2, p^3, ...) &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A036386 extends A246547 {

  private long mCount = 0;
  private Z mLim = Z.TWO;

  @Override
  public Z next() {
    do {
      ++mCount;
    } while (super.next().compareTo(mLim) <= 0);
    mLim = mLim.multiply2();
    return Z.valueOf(mCount - 1);
  }
}
