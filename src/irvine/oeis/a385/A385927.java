package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385927 a(n) = numerator m of the fraction m/n that is most closely approximated by a prime-fraction p/q, under conditions stated in A385925.
 * @author Sean A. Irvine
 */
public class A385927 extends A385925 {

  @Override
  protected Z select(final Q pq, final Q nm) {
    return nm.num();
  }
}
