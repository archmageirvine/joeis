package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024760 Binomial coefficients: C(n,k), 8 &lt;= k &lt;= n-8, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024760 extends A006987 {

  @Override
  protected long start() {
    return 8;
  }
}
