package irvine.oeis.a193;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193632 Triangle: T(n,k)=C(4n-1,2k), 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A193632 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(4L * n - 1, 2L * k);
  }
}
