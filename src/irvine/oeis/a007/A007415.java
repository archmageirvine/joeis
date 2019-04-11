package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007415 Expand sin <code>x /</code> exp <code>x = x-x^2+x^3/3-x^5/30+</code>... and invert nonzero coefficients.
 * @author Sean A. Irvine
 */
public class A007415 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      if ((mN & 1) == 0) {
        mF = mF.divide2();
      }
    }
    return mF.multiply(Long.signum(mN & 3)).multiply(((mN + 1 + mN / 4) & 1) == 0 ? 1 : -1);
  }
}
