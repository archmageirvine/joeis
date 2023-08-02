package irvine.oeis.a204;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A204579 Triangle read by rows: matrix inverse of A036969.
 * @author Georg Fischer
 */
public class A204579 extends Triangle {

  /** Construct the sequence. */
  public A204579() {
    setOffset(1);
    hasRAM(false);
  }

  /* T(n,k) = T(n-1,k-1) - (n-1)^2*T(n-1,k). */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return n == k ? Z.ONE : get(n - 2, k - 2).add(get(n - 2, k - 1).multiply((long) -(n - 1) * (n - 1)));
  }
}
