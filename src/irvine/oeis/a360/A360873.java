package irvine.oeis.a360;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a262.A262307;

/**
 * A360873 Array read by antidiagonals: T(m,n) is the number of (non-null) connected induced subgraphs in the rook graph K_m X K_n.
 * @author Gregory Morse
 */
public class A360873 extends A262307 {
  @Override
  protected Z term(final int m, final int n) {
    Z sum = Z.ZERO;
    for (int i = 1; i <= m; ++i) {
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(Binomial.binomial(m, i).multiply(Binomial.binomial(n, j)).multiply(get(i, j)));
      }
    }
    return sum;
  }
}
