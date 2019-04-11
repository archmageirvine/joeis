package irvine.oeis.a175;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012857;

/**
 * A175671 Denominator of <code>[x^(2n)]</code> of the Taylor expansion log(cosec(x)*arctan(x))= <code>-x^2/6 +3*x^4/20 -50*x^6/567 +203*x^8/3240 -7472*x^10/155925 +..</code>.
 * @author Sean A. Irvine
 */
public class A175671 extends A012857 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
