package irvine.oeis.a193;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193633 Triangle: T(n,k)=C(4n,2k), 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A193633 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(4L * n, 2L * k);
  }
}
