package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A076899 Let u(1)=u(2)=u(3)=1, u(n)=sign(u(n-1)-u(n-2))/(u(n-3)+1); then a(n) is the denominator of u(n).
 * @author Sean A. Irvine
 */
public class A076899 extends A076898 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
