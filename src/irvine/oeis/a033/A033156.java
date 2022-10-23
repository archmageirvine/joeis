package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033156 a(1) = 1; for m &gt;= 2, a(n) = a(n-1) + floor(a(n-1)/(n-1)) + 2.
 * @author Sean A. Irvine
 */
public class A033156 extends Sequence1 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(mA.divide(mN)).add(2);
    }
    return mA;
  }
}
