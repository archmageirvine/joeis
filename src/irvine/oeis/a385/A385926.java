package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385926 a(n) = numerator p of the prime-fraction p/q that most closely approximates m/n as in A385925.
 * @author Sean A. Irvine
 */
public class A385926 extends A385925 {

  @Override
  protected Z select(final Q pq, final Q nm) {
    return pq.num();
  }
}
