package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391668 Table read by antidiagonals. T(n,k) is the least number coprime to all numbers in [n+1, n+k].
 * @author Sean A. Irvine
 */
public class A391668 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;

  private boolean is(final int k, final int n, final int m) {
    for (int j = n; j <= m; ++j) {
      if (Functions.GCD.i(k, j) > 1) {
        return false;
      }
    }
    return true;
  }

  private Z t(final int n, final int m) {
    int k = 1;
    while (true) {
      if (is(++k, n + 1, n + m)) {
        return Z.valueOf(k);
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}

