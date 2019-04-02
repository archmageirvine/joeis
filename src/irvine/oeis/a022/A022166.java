package irvine.oeis.a022;

import irvine.oeis.a015.A015109;

/**
 * A022166 Triangle of Gaussian binomial coefficients (or q-binomial coefficients) [n,k] for q = 2.
 * @author Sean A. Irvine
 */
public class A022166 extends A015109 {

  @Override
  protected long q() {
    return 2;
  }
}
