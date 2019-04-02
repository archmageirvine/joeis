package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001812 Coefficients of Laguerre polynomials.
 * @author Sean A. Irvine
 */
public class A001812 implements Sequence {

  private long mN = 4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 5) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 5);
    }
    return mA;
  }
}
