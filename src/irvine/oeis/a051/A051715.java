package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051715 Denominators of table a(n,k) read by antidiagonals: a(0,k) = 1/(k+1), a(n+1,k) = (k+1)(a(n,k)-a(n,k+1)), n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A051715 extends A051714 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
