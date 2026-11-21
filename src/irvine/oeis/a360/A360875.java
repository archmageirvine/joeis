package irvine.oeis.a360;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a262.A262307;

/**
 * A360875 Array read by antidiagonals: T(m,n) is the number of connected dominating sets in the rook graph K_m X K_n.
 * @author Gregory Morse
 */
public class A360875 extends A262307 {
  private Z allRows(final int m, final int n) {
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      sum = sum.add(Binomial.binomial(n, j).multiply(get(m, j)));
    }
    return sum;
  }

  @Override
  protected Z term(final int m, final int n) {
    return allRows(m, n).add(allRows(n, m)).subtract(get(m, n));
  }
}
