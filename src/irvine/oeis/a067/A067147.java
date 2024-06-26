package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067147 Triangle of coefficients for expressing x^n in terms of Hermite polynomials.
 * @author Sean A. Irvine
 */
public class A067147 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return ((mN - mM) & 1) == 1
      ? Z.ZERO
      : Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z((mN - mM) / 2));
  }
}

