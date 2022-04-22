package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157632 Triangle T(n,m) read by rows: 1 in column m=0 and on the diagonal, else 3*n*m*(n-m).
 * @author Georg Fischer
 */
public class A157632 extends Triangle {

  /** Construct the sequence. */
  public A157632() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int m) {
    return m == 0 || n == m ? Z.ONE : Z.valueOf(3L * n).multiply(m).multiply(n - m);
  }
}
