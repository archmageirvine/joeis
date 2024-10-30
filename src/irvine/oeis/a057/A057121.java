package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A057121 Local ranks of terms of A057119.
 * @author Sean A. Irvine
 */
public class A057121 extends A057119 {

  private int mN = -1;

  private static Z mn(final long n, final long x, final long y) {
    return Binomial.binomial(2 * n - x, n - (x + y) / 2).subtract(Binomial.binomial(2 * n - x, n - 1 - (x + y) / 2));
  }

  /**
   * The local Catalan rank of a tree.
   * @param n size
   * @param aa tree
   * @return rank
   */
  public static Z catalanRank(final long n, final Z aa) {
    Z a = Functions.REVERSE.z(2, aa);
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

  @Override
  public Z next() {
    return catalanRank(1L << ++mN, super.next());
  }
}
