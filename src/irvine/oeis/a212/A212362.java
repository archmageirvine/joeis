package irvine.oeis.a212;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A212362 Triangle by rows, binomial transform of the beheaded Pascal's triangle A074909.
 * T(n, k) = 2^(n-k)*binomial(n+1, k) + (2^(n-k) - 1)*binomial(n, k-1).
 * @author Georg Fischer
 */
public class A212362 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.ONE.shiftLeft(n - k).multiply(Binomial.binomial(n + 1, k))
      .add(Z.ONE.shiftLeft(n - k).subtract(1).multiply(Binomial.binomial(n, k - 1)));
  }
}
