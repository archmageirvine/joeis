package irvine.oeis.a196;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A196839 Triangle of denominators of the coefficient of x^m in the n-th Bernoulli polynomial, 0 &lt;= m &lt;= n.
 * @author Sean A. Irvine
 */
public class A196839 extends A196838 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
