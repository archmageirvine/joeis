package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385926 a(n) = numerator p of prime-fraction p/q that minimizes |m/n - p/q| with m/n != p/q, where p is 1 or prime, q is prime, q &lt; n, and 1 &lt;= m &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A385926 extends A385925 {

  @Override
  protected Z select(final Q pq, final Q nm) {
    return pq.num();
  }
}
