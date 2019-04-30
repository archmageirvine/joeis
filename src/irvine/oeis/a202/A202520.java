package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012858;

/**
 * A202520 Denominator of <code>[x^(4n+2)]</code> in the Taylor series <code>log(cosec(x)*sinh(x))= x^2/3 +2*x^6/2835 +2*x^10/467775 +4*x^14/127702575 +</code>...
 * @author Sean A. Irvine
 */
public class A202520 extends A012858 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
