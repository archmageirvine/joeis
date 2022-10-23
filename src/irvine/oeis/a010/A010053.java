package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010053 a(n) = 4^n*(2*n+1)!*(n!)^2/(n+1).
 * @author Sean A. Irvine
 */
public class A010053 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN).multiply(mN).multiply(2 * mN + 1).multiply(2 * mN).shiftLeft(2);
    }
    return mF.divide(mN + 1);
  }
}

