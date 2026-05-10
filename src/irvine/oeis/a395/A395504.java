package irvine.oeis.a395;

import irvine.oeis.FilterNumberSequence;

/**
 * A395504 Integers m such that there are more than 2 integers k, 1 &lt;= k &lt; m, such that m divides k^2-1 and k divides m^2-1.
 * @author Sean A. Irvine
 */
public class A395504 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395504() {
    super(1, m -> {
      int cnt = 0;
      final long m2 = m * m - 1;
      for (long k = 1; k < m; ++k) {
        if (m2 % k == 0 && (k * k - 1) % m == 0 && ++cnt > 2) {
          return true;
        }
      }
      return false;
    });
  }
}
