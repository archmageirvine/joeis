package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a005.A005114;

/**
 * A057978 Number of untouchable numbers &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A057978 extends A005114 {

  private long mLimit = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit = mLimit * 10;
    while (super.next().longValueExact() <= mLimit) {
      ++mCount;
    }
    return Z.valueOf(mCount++);
  }
}
