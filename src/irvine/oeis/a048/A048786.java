package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048786 Triangle of coefficients of certain exponential convolution polynomials.
 * @author Sean A. Irvine
 */
public class A048786 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN - 1, mM - 1).multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).shiftLeft(2L * (mN - mM));
  }
}
