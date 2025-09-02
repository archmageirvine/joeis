package irvine.oeis.a080;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A080045 Denominators of triangular array: T(n,1)=T(n,n)=1/n and T(n,k)=T(n-1,k-1)+t(n-1,k), 1&lt;k&lt;n.
 * @author Sean A. Irvine
 */
public class A080045 extends A080044 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
