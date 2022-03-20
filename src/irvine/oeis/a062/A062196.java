package irvine.oeis.a062;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A062196 Triangle read by rows, T(n, k) = binomial(n, k)*binomial(n + 2, k).
 * @author Georg Fischer
 */
public class A062196 extends Triangle {

  /** Construct the sequence. */
  public A062196() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n, k).multiply(Binomial.binomial(n + 2, k));
  }
}
