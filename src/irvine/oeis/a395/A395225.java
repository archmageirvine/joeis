package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A395225 Denominator of (zeta(4*n) / zeta(2*n)^2) * (4^n + 1)/(4^n - 1) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A395225 extends A395224 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
