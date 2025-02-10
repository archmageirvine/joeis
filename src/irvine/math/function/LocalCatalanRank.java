package irvine.math.function;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Local Catalan rank function.
 * Used by a great many sequences from Antti Karttunen.
 * @author Sean A. Irvine
 */
class LocalCatalanRank extends AbstractFunction2 {

  private static Z mn(final long n, final long x, final long y) {
    return Binomial.binomial(2 * n - x, n - (x + y) / 2).subtract(Binomial.binomial(2 * n - x, n - 1 - (x + y) / 2));
  }

  @Override
  public Z z(final long n, final Z tree) {
    Z a = Functions.REVERSE.z(2, tree);
    long y = 0;
    Z lo = Z.ZERO;
    for (long x = 1; x < 2 * n; ++x) {
      if (a.mod(2) == 0) {
        lo = lo.add(mn(n, x, y + 1));
      }
      y += a.isOdd() ? 1 : -1;
      a = a.divide2();
    }
    return Functions.CATALAN.z(n).subtract(lo.add(1));
  }
}
