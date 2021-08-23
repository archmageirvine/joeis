package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051012 Denominator of average of number of steps in Euclidean algorithm for all gcd(m,n) with 0 &lt;= m &lt; n.
 * @author Sean A. Irvine
 */
public class A051012 extends A051011 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
