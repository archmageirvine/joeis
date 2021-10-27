package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A059300 Triangle of idempotent numbers binomial(n,k)*k^(n-k), version 4.
 * T(n,k) = binomial(n+1,n-k+1)*(n-k+1)^k.
 * @author Georg Fischer
 */
public class A059300 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n + 1, n - k + 1).multiply(Z.valueOf(n - k + 1).pow(k));
  }
}
