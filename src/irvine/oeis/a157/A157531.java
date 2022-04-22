package irvine.oeis.a157;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157531 Triangle T(n, k) = binomial(2*n, n) + binomial(n, k)^2, read by rows.
 * @author Georg Fischer
 */
public class A157531 extends Triangle {

  /** Construct the sequence. */
  public A157531() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(2L * n, n).add(Binomial.binomial(n, k).square());
  }
}
