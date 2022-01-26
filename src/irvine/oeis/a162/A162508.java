package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A162508 A binomial sum of powers related to the Bernoulli numbers, triangular array, read by rows.
 * T(n,k) = (k + 1)*T(n-1,k) - k*T(n-1,k-1)
 * @author Georg Fischer
 */
public class A162508 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.NEG_ONE : get(n - 1, k).multiply(k + 2).subtract(get(n - 1, k - 1).multiply(k + 1));
  }
}
