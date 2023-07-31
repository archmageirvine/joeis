package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A064846 Let r_1 = 1; r_{n+1} = [r_1; r_2, r_3,..., r_n]; n-th term is denominator of r_n.
 * @author Sean A. Irvine
 */
public class A064846 extends A064845 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
