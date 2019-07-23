package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024762 Binomial coefficients: <code>C(n,k), 10 &lt;= k &lt;= n-10</code>, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024762 extends A006987 {

  @Override
  protected long start() {
    return 10;
  }
}
