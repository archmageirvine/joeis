package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012859;

/**
 * A202522 Denominator of the coefficient of <code>[x^(2n)]</code> of the Taylor series <code>log(cosec(x)*arcsinh(x))= x^4/15 -x^6/30 +25*x^8/1134 -269*x^10/17010 +4401359*x^12/364864500-..</code>.
 * @author Sean A. Irvine
 */
public class A202522 extends A012859 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
