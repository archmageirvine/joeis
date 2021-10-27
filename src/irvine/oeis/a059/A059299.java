package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A059299 Triangle of idempotent numbers binomial(n,k)*k^(n-k), version 3.
 * T(n,k) = binomial(n+1,n-k+1)*(n-k+1)^k.
 * @author Georg Fischer
 */
public class A059299 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n, n - k).multiply(Z.valueOf(n - k).pow(k));
  }
}
