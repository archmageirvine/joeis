package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052157 Least positive integer r such that there exists an integer s, 0 &lt;= s &lt; r gcd(r-i, s-j) &gt; 1 for all integers i, j with 0 &lt;= i, j &lt; n.
 * @author Sean A. Irvine
 */
public class A052157 extends Sequence1 {

  // Note Charles R Greathouse IV has better method

  private long mN = 0;

  private boolean is(final long s, final long r, final long n) {
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if (Functions.GCD.l(r - i, s - j) <= 1) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean is(final long r, final long n) {
    for (long s = 0; s < r; ++s) {
      if (is(s, r, n)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    while (!is(++r, mN)) {
      // do nothing
    }
    return Z.valueOf(r);
  }
}
