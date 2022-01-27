package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A077051 Right summatory matrix, T, by antidiagonals.
 * T(n,k)=1 if k|n, otherwise T(n,k)=0, k &gt;= 1, n >&gt;= 1.
 * @author Georg Fischer
 */
public class A077051 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A077051() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return (k % n == 0) ? Z.ONE : Z.ZERO;
  }
}
