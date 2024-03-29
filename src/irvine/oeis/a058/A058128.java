package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058128 a(1) = 1, a(n) = (n^n-n)/(n-1)^2 for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A058128 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(mN).subtract(mN).divide(mN - 1).divide(mN - 1);
  }
}
