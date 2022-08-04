package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058306 Denominator of H(n), where H(0)=-1/12, H(n) = number of equivalence classes of positive definite quadratic forms a*x^2+b*x*y+c*y^2 with discriminant b^2-4ac = -n, counting forms equivalent to x^2+y^2 (resp. x^2+x*y+y^2) with multiplicity 1/2 (resp. 1/3).
 * @author Sean A. Irvine
 */
public class A058306 extends A058305 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
