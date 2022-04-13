package irvine.oeis.a110;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A110608 Number triangle T(n,k) = binomial(n,k)*binomial(2n,n-k).
 * @author Georg Fischer
 */
public class A110608 extends Triangle {

  /** Construct the sequence. */
  public A110608() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n, k).multiply(Binomial.binomial(2L * n, n - k));
  }
}
