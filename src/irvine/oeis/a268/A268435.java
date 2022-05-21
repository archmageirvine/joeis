package irvine.oeis.a268;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A268435 Triangle read by rows, T(n,k) = RF(n-k+1,n-k)*S2(n,k) where RF denotes the rising factorial and S2 the Stirling set numbers, for n&gt;=0 and 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A268435 extends Triangle {

  /** Construct the sequence. */
  public A268435() {
    hasRAM(false);
  }

  /* T(n,k) = k*(4*(n-k)-2)*T(n-1,k) + T(n-1, k-1) */
  @Override
  protected Z compute(final int n, final int k) {
    return k == n ? Z.ONE : (k == 0 ? Z.ZERO : get(n - 1, k - 1).add(get(n - 1, k).multiply(k * (4 * (n - k) - 2))));
  }
}
