package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001810 a(n) = n!*n*(n-1)*(n-2)/36.
 * @author Sean A. Irvine
 */
public class A001810 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    if (mN > 3) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 3);
    }
    return mA;
  }
}
