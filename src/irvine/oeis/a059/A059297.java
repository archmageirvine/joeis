package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A059297 Triangle of idempotent numbers binomial(n,k)*k^(n-k), version 1.
 * @author Georg Fischer
 */
public class A059297 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n, k).multiply(Z.valueOf(k).pow(n - k));
  }
}
