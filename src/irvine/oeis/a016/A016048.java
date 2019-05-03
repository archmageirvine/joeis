package irvine.oeis.a016;

import irvine.math.z.Z;

/**
 * A016048 Least k such that <code>(2*p_n)*k + 1 | Mersenne(p_n), p_n = n-th</code> prime, <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A016048 extends A016047 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2().divide(mP);
  }
}
