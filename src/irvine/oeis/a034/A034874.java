package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A034874 a(1) = 1; for n &gt;= 2, a(n) = n times the reverse of a(n-1).
 * @author Sean A. Irvine
 */
public class A034874 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = ZUtils.reverse(mA).multiply(mN);
    }
    return mA;
  }
}
