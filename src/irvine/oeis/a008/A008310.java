package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008310 Triangle of coefficients of Chebyshev polynomials T_n(x).
 * @author Sean A. Irvine
 */
public class A008310 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN < 1) {
      ++mN;
      return Z.ONE;
    }
    mM += 2;
    if (mM > mN) {
      ++mN;
      mM = mN & 1;
    }
    final int t = (mN + mM) / 2 - 1;
    final Z c = Functions.FACTORIAL.z(t).multiply(mN).shiftLeft(mM - 1).divide(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z((mN - mM) / 2));
    return ((mN - mM) & 2) == 0 ? c : c.negate();
  }
}
