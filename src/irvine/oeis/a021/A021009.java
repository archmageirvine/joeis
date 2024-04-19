package irvine.oeis.a021;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A021009 Triangle of coefficients of Laguerre polynomials n!*L_n(x) (rising powers of x).
 * @author Sean A. Irvine
 */
public class A021009 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Z t = Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).multiply(Binomial.binomial(mN, mM));
    return (mM & 1) == 0 ? t : t.negate();
  }
}

