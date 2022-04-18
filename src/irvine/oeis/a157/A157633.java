package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157633 Triangle T(n,m) read rows: 1 in column m=0 and on the diagonal, 2*m*(n-m)*(m^2-n*m+2*n^2) otherwise.
 * @author Georg Fischer
 */
public class A157633 extends Triangle {

  /** Construct the sequence. */
  public A157633() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int m) {
    return m == 0 || n == m ? Z.ONE : Z.valueOf(2 * m).multiply(n - m).multiply(m * m - n * m + 2 * n * n);
  }
}
