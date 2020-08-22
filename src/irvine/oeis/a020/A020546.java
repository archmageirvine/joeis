package irvine.oeis.a020;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020546 4th Bernoulli polynomial evaluated at x=n! (multiplied by 30).
 * @author Sean A. Irvine
 */
public class A020546 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return BernoulliPolynomials.firstKindEval(4, new Q(mF)).multiply(30).toZ();
  }
}
