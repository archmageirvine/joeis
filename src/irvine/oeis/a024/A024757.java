package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024757 Binomial coefficients: <code>C(n,k), 5 &lt;= k &lt;= n-5</code>, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024757 extends A006987 {

  @Override
  protected long start() {
    return 5;
  }
}
