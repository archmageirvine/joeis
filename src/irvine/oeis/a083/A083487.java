package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A083487 Triangle read by rows: T(n,k) = 2*n*k + n + k (1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A083487 extends Triangle {

  /** Construct the sequence. */
  public A083487() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(2L * (n + 1) * (k + 1) + n + 1 + k + 1);
  }
}
