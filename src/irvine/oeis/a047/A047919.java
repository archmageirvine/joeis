package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047919 Triangular array read by rows: a(n,k) = Sum_{d|k} mu(d)*U(n,k/d)/n if k|n else 0, where U(n,k) = A047916(n,k) (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A047919 extends A047918 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
