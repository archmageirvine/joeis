package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055107 Triangle T(k,n) giving number of symmetric polynomials of degree n in k noncommuting variables, n &gt;=2, 2 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A055107 extends A055106 {

  @Override
  protected Z a(final int k, final int n) {
    return super.a(n - k + 1, n);
  }
}
