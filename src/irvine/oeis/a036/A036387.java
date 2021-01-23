package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a029.A029827;

/**
 * A036387 Number of connected numbers (A029827) with binary order (A029837) &lt;= n.
 * @author Sean A. Irvine
 */
public class A036387 extends A029827 {

  private static final Z Z16 = Z.valueOf(16);
  private long mCount = 0;
  private Z mLim = Z.TWO;

  @Override
  public Z next() {
    if (mLim.compareTo(Z16) <= 0) {
      final Z res = Z16.equals(mLim) ? Z.ONE : Z.ZERO;
      mLim = mLim.multiply2();
      return res;
   }
    do {
      ++mCount;
    } while (super.next().compareTo(mLim) <= 0);
    mLim = mLim.multiply2();
    return Z.valueOf(mCount - 1);
  }
}
