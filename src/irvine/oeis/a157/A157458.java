package irvine.oeis.a157;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157458 Triangle, read by rows, double tent function: T(n,k) = min(1 + 2*k, 1 + 2*(n-k), n).
 * @author Georg Fischer
 */
public class A157458 extends Triangle {

  /** Construct the sequence. */
  public A157458() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(LongUtils.min(1 + 2L * k, 1 + 2L * (n - k), n));
  }
}
