package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A173787 Triangle read by rows: T(n,k) = 2^n - 2^k, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A173787 extends Triangle {

  /** Construct the sequence. */
  public A173787() {
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.ONE.shiftLeft(n).subtract(Z.ONE.shiftLeft(k));
  }
}
