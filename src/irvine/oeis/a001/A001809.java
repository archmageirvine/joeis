package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001809 a(n) = n! * n(n-1)/4.
 * @author Sean A. Irvine
 */
public class A001809 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    if (mN > 2) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 2);
    }
    return mA;
  }
}
