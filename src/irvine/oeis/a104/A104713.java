package irvine.oeis.a104;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A104713 Triangle T(n,k) = binomial(n,k), read by rows, 3 &lt;= k &lt;=n .
 * @author Georg Fischer
 */
public class A104713 extends Triangle {

  /** Construct the sequence. */
  public A104713() {
    setOffset(3);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n + 3, k + 3);
  }
}
