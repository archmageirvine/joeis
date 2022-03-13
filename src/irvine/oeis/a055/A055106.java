package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055106 Triangle T(n,k) giving number of symmetric polynomials of degree n in k noncommuting variables, n &gt;=2, 2 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A055106 extends A055105 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? super.next() : t;
  }
}
