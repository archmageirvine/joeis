package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A053383 Triangle T(n,k) giving denominator of coefficient of x^(n-k) in Bernoulli polynomial B(n, x), n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A053383 extends A053382 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
