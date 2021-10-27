package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A059298 Triangle of idempotent numbers binomial(n,k)*k^(n-k), version 2.
 * @author Georg Fischer
 */
public class A059298 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n + 1, k + 1).multiply(Z.valueOf(k + 1).pow(n - k));
  }
}
