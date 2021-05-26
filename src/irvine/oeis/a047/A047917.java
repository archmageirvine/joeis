package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047917 Triangular array read by rows: a(n,k) = phi(n/k)*(n/k)^k*k!/n if k|n else 0 (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A047917 extends A047916 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
