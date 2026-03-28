package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394507 Triangle read by rows: T(n,k) = denominator(binomial(1/n, k)) with 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A394507 extends A394506 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
