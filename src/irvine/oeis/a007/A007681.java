package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007681 a(n) = (2*n+1)^2*n!.
 * @author Sean A. Irvine
 */
public class A007681 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(Z.valueOf(2 * mN + 1).square());
  }
}
