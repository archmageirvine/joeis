package irvine.oeis.a291;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.a290.A290818;

/**
 * A291543 Array read by antidiagonals: T(m,n) = number of maximal irredundant sets in the lattice (rook) graph K_m X K_n.
 * @author Gregory Morse
 */
public class A291543 extends A290818 {
  // After Andrew Howroyd.
  @Override
  protected Z term(final int m, final int n) {
    Z sum = RING.eval(dominating(m, n), Z.ONE);
    for (int k = 2; k <= m - 2; ++k) {
      for (int j = 2; j <= Math.min(m - k, n); ++j) {
        final Z a = Binomial.binomial(m, k).multiply(Binomial.binomial(n, j));
        final Z b = Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(j));
        sum = sum.add(a.multiply(b).multiply(Stirling.associatedSecondKind(2, n - j, k - 1)).multiply(Functions.STIRLING2.z(m - k, j - 1)));
      }
    }
    return sum;
  }
}
