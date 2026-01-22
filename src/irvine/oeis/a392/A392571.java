package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A392571 a(n) = denominator(b(n)), where b(n) = b(n-1) + n if n is odd and b(n-1)*n/(b(n-1) + n) if n is even, with b(0) = 0.
 * @author Sean A. Irvine
 */
public class A392571 extends A392570 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
