package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033540 a(n+1) = n*(a(n) + 1) for n &gt;= 1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A033540 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(1).multiply(mN);
    }
    return mA;
  }
}
