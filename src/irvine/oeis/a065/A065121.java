package irvine.oeis.a065;

import java.util.List;

import irvine.math.LongUtils;
import irvine.math.cr.Convergents;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065121 Least m such that the maximal palindrome within the period of the continued fraction for sqrt(m) is the n-th row of Pascal's triangle; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A065121 extends Sequence1 {

  private int mN = -1;

  private Z[] getBinomialRow(final int n) {
    final Z[] row = new Z[n + 1];
    for (int k = 0; k <= n; ++k) {
      row[k] = Binomial.binomial(n, k);
    }
    return row;
  }

  private boolean is(final Z[] a, final List<Z> b) {
    if (b.size() - 2 != a.length) {
      return false;
    }
    for (int k = 0; k < a.length; ++k) {
      if (!b.get(k + 1).equals(a[k])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Z[] row = getBinomialRow(mN);
    long m = 1;
    while (true) {
      ++m;
      if (!LongUtils.isSquare(m)) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(m);
        if (is(row, conv)) {
          return Z.valueOf(m);
        }
      }
    }
  }
}
