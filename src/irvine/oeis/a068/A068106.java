package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A068106 Euler's difference table: triangle read by rows, formed by starting with factorial numbers (A000142) and repeatedly taking differences. T(n,n) = n!, T(n,k) = T(n,k+1) - T(n-1,k).
 * formed by starting with factorial numbers (A000142) and repeatedly taking differences.
 * T(n,n) = n!, T(n,k) = T(n,k+1) - T(n-1,k).
 * @author Georg Fischer
 */
public class A068106 extends Triangle {

  /** Construct the sequence. */
  public A068106() {
    super(1, 0, 1);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n < 2
      ? super.compute(n, k)
      : (k == 0
      ? get(n - 1, 0).add(get(n - 2, 0)).multiply(n - 1)
      : get(n - 1, k - 1).add(get(n, k - 1)));
  }
}
