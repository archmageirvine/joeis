package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A158823 Triangle read by rows: matrix product A004736 * A158821.
 * @author Georg Fischer
 */
public class A158823 extends BaseTriangle {

  /** Construct the sequence. */
  public A158823() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n, k) = (n-k+1)*(k-1), k>1. T(n, 1) = A000217(n).
    return Z.valueOf((k == 1) ? (long) n * (n + 1) / 2 : (long) (n - k + 1) * (k - 1));
  }
}
