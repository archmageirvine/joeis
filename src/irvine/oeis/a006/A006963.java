package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006963 Number of planar embedded labeled trees with n nodes: (2n-3)!/(n-1)! for n &gt;= 2, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A006963 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(mN - 2).multiply(2 * mN - 3).multiply2().divide(mN - 1);
    }
    return mA;
  }
}
