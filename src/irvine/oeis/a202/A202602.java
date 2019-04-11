package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012861;

/**
 * A202602 Denominator of the coefficient of <code>[x^(2n)]</code> of the Taylor series log(cosec(x)*arctanh(x))= <code>x^2/2 +3*x^4/20 +4*x^6/45 +203*x^8/3240 +2038*x^10/42525 +</code>...
 * @author Sean A. Irvine
 */
public class A202602 extends A012861 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
