package irvine.oeis.a020;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020544 Second Bernoulli polynomial evaluated at x=n! (multiplied by 6).
 * @author Sean A. Irvine
 */
public class A020544 extends Sequence0 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return BernoulliPolynomials.firstKindEval(2, new Q(mF)).multiply(6).toZ();
  }
}
