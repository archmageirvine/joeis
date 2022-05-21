package irvine.oeis.a251;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A251636 Inverse of the Riordan array A251634: Riordan ((1-3*x)/(1-2*x), x/(1-2*x)).
 * @author Georg Fischer
 */
public class A251636 extends Triangle {

  /** Construct the sequence. */
  public A251636() {
    hasRAM(false);
  }

  /* T(n, k) = T(n-1, k-1) + 2* T(n-1, k), for n >= k >= 1; T(0, 0) = 1; T(n, k) = 0 if n < k. */
  @Override
  protected Z compute(final int n, final int k) {
    return k == n ? Z.ONE : (k == 0 ? Z.ONE.shiftLeft(n - 1).negate() : get(n - 1, k - 1).add(get(n - 1, k).multiply2()));
  }
}
