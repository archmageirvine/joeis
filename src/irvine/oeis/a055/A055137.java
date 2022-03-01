package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055137 Regard triangle of rencontres numbers (see A008290) as infinite matrix, compute inverse, read by rows.
 * T(n, k) = (1-n+k)*binomial(n, k).
 * @author Georg Fischer
 */
public class A055137 extends Triangle {

  /** Construct the sequence. */
  public A055137() {
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n, k).multiply(1 - n + k);
  }
}
