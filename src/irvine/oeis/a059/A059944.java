package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059944 Denominators of Maclaurin series coefficients for 2*cos(x/sqrt(3) + arctan(-sqrt(3))) = cos(x/sqrt(3)) + sqrt(3)*sin(x/sqrt(3)).
 * @author Sean A. Irvine
 */
public class A059944 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      if ((mN & 1) == 0) {
        mF = mF.multiply(3);
      }
    }
    return mF;
  }
}
