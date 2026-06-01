package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a394.A394466;

/**
 * A395314 Triangle read by rows: T(n,k) = denominator(CF(n,k)), where CF(n,k) = (1/k!) * Sum_{j=0..k} (-1)^j * binomial(k,j) * (2+k/2-j)^n.
 * @author Sean A. Irvine
 */
public class A395314 extends A394466 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
