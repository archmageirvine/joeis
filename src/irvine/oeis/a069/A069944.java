package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A069944 a(n) = denominator(b(n)), where b(1) = b(2) = 1, b(n) = (b(n-1) + b(n-2))/(n-1).
 * @author Sean A. Irvine
 */
public class A069944 extends A069943 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
