package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024756 Binomial coefficients: C(n,k), 4 &lt;= k &lt;= n-4, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024756 extends A006987 {

  @Override
  protected long start() {
    return 4;
  }
}
