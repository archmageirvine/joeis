package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024759 Binomial coefficients: C(n,k), 7 &lt;= k &lt;= n-7, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024759 extends A006987 {

  @Override
  protected long start() {
    return 7;
  }
}
