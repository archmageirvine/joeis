package irvine.oeis.a193;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193635 Triangle: T(n,k)=C(3n-k,k), 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A193635 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(3L * n - k, k);
  }
}
