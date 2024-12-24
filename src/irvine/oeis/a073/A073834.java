package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A073834 Denominators of b(n) where b(1) = 1, b(i) = b(i-1) + 1/b(i-1).
 * @author Sean A. Irvine
 */
public class A073834 extends A073833 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
