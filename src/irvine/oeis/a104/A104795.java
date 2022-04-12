package irvine.oeis.a104;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A104795 Triangle T(n,k) = C(n,k)+1 for k&lt;n; T(n,k) = 1 for k=n, read by rows.
 * @author Georg Fischer
 */
public class A104795 extends Triangle {

  /** Construct the sequence. */
  public A104795() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 || k == n ? Z.ONE : Binomial.binomial(n, k).add(1);
  }
}
