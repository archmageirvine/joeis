package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A162245 Triangle T(n,m) = 6*m*n + 3*m + 3*n + 1 read by rows.
 * @author Georg Fischer
 */
public class A162245 extends Triangle {

  /** Construct the sequence. */
  public A162245() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(6 * k * n + 9 * k + 9 * n + 13);
  }
}
