package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024761 Binomial coefficients: <code>C(n,k), 9 &lt;= k &lt;= n-9</code>, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024761 extends A006987 {

  @Override
  protected long start() {
    return 9;
  }
}
