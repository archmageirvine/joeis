package irvine.oeis.a022;

import irvine.oeis.a015.A015109;

/**
 * A022174 Triangle of Gaussian binomial coefficients [ n,k ] for q <code>= 10</code>.
 * @author Sean A. Irvine
 */
public class A022174 extends A015109 {

  @Override
  protected long q() {
    return 10;
  }
}
