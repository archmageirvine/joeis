package irvine.oeis.a173;

import irvine.oeis.a015.A015109;

/**
 * A173583 Triangle T(n, k, q) = q-binomial(n, k, q^2), for q = 5, read by rows.
 * @author Georg Fischer
 */
public class A173583 extends A015109 {

  @Override
  protected long q() {
    return 25;
  }
}
