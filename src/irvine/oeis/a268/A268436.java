package irvine.oeis.a268;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A268436 Triangle read by rows, T(n,k) = RF(n-k+1, n-k) * S1(n,k) where RF denotes the rising factorial and S1 the Stirling cycle numbers, for n&gt;=0 and 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A268436 extends Triangle {

  /** Construct the sequence. */
  public A268436() {
    hasRAM(false);
  }

  /* T(n,k) = (n-1)*(4*(n-k)-2)*T(n-1,k) + T(n-1 k-1) */
  @Override
  protected Z compute(final int n, final int k) {
    return k == n ? Z.ONE : (k == 0 ? Z.ZERO : get(n - 1, k - 1).add(get(n - 1, k).multiply((n - 1) * (4 * (n - k) - 2))));
  }
}
