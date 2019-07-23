package irvine.oeis.a024;

import irvine.oeis.a006.A006987;

/**
 * A024755 Binomial coefficients: <code>C(n,k), 3 &lt;= k &lt;= n-3</code>, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A024755 extends A006987 {

  @Override
  protected long start() {
    return 3;
  }
}
