package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027760 Denominator of Sum_{p prime, p-1 divides n} 1/p.
 * @author Sean A. Irvine
 */
public class A027760 extends A027759 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
