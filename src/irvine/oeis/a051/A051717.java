package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051717 1, followed by denominators of first differences of Bernoulli numbers (B(i)-B(i-1)).
 * @author Sean A. Irvine
 */
public class A051717 extends A051716 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
