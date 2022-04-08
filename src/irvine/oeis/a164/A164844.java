package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A164844 Generalized Pascal Triangle - satisfying the same recurrence as Pascal's triangle, but with a(n,0)=1 and a(n,n)=10^n (instead of both being 1).
 * @author Georg Fischer
 */
public class A164844 extends Triangle {

  /** Construct the sequence. */
  public A164844() {
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : (k == n ? Z.TEN.pow(n) : get(n - 1, k - 1).add(get(n - 1, k)));
  }
}
