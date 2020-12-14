package irvine.oeis.a037;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A037162 Well-order the rational numbers; take denominators.
 * @author Sean A. Irvine
 */
public class A037162 extends A037161 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
