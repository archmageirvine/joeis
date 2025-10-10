package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081063 Number of numbers &lt;= n that are 3-smooth or prime powers.
 * @author Sean A. Irvine
 */
public class A081063 extends A081061 {

  private Z mN = Z.ZERO;
  private Z mA = super.next();
  private long mCnt = 0;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mA)) {
      mA = super.next();
      ++mCnt;
    }
    return Z.valueOf(mCnt);
  }
}
