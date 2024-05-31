package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002465 Number of ways to place n nonattacking bishops on an n X n board.
 * @author Sean A. Irvine
 */
public class A002465 extends Sequence1 {

  private int mN = 0;

  private Z sum1(final int n, final int i) {
    Z s = Z.ZERO;
    final int lim = (n + 1) / 2;
    final int l2 = n / 2;
    for (int j = 0; j <= lim; ++j) {
      s = s.add(Binomial.binomial(lim, j).multiply(Functions.STIRLING2.z(j + l2, n - i)));
    }
    return s;
  }

  private Z sum2(final int n, final int i) {
    Z s = Z.ZERO;
    final int lim = n / 2;
    final int l2 = (n + 1) / 2;
    for (int j = 0; j <= lim; ++j) {
      s = s.add(Binomial.binomial(lim, j).multiply(Functions.STIRLING2.z(j + l2, i)));
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int i = 1; i < mN; ++i) {
      s = s.add(sum1(mN, i).multiply(sum2(mN, i)));
    }
    return s;
  }
}
