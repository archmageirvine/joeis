package irvine.oeis.a107;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A107131 A Motzkin related triangle.
 * T(n, k) = binomial(k+1, n-k+1)*binomial(n, k)/(k+1).
 * @author Georg Fischer
 */
public class A107131 extends Triangle {

  /** Construct the sequence. */
  public A107131() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(k + 1, n - k + 1).multiply(Binomial.binomial(n, k)).divide(k + 1);
  }
}
