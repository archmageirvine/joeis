package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A057867 Denominator of coefficient of Pi^n in Ramanujan-like series for Zeta[4n+3].
 * @author Sean A. Irvine
 */
public class A057867 extends A057866 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
