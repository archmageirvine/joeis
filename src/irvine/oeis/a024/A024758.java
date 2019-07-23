package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024758 Binomial coefficients: <code>C(n,k), 6 &lt;= k &lt;= n-6</code>, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024758 extends A006987 {

  @Override
  protected long start() {
    return 6;
  }
}
