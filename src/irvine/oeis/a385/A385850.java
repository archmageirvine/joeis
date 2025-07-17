package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385850 Triangle read by rows: T(n,k) = denominator((Sum_{i=1..k} (n-i+1)^2)/(Sum_{i=1..k} i^2)), with 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A385850 extends A385849 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

