package irvine.oeis.a062;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A062344 Triangle of binomial(2*n, k) with n &gt;= k.
 * @author Georg Fischer
 */
public class A062344 extends Triangle {

  /** Construct the sequence. */
  public A062344() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(2L * n, k);
  }
}
