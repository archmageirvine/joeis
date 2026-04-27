package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A057867 Denominator of coefficient of Pi^(4n-1) in Ramanujan-like series for zeta(4n-1).
 * @author Sean A. Irvine
 */
public class A057867 extends A057866 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
