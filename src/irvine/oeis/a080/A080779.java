package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080779 Triangle read by rows: n-th row gives expansion of the series for HarmonicNumber(n, -r).
 * @author Sean A. Irvine
 */
public class A080779 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return BernoulliPolynomials.firstKindEval(mN - mM, Q.ONE).multiply(Binomial.binomial(mN + 1, mN - mM)).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
