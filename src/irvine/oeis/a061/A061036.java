package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A061036 Triangle T(m,n) = denominator of 1/m^2 - 1/n^2, n &gt;= 1, m=n,n-1,n-2,...,1.
 * @author Sean A. Irvine
 */
public class A061036 extends A061035 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
