package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A057158 Numerator of Sum_{k&lt;=n} P(k)/p(k), where p(k) (resp. P(k)) is smallest (resp. largest) prime divisor of k.
 * @author Sean A. Irvine
 */
public class A057158 extends A057155 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
