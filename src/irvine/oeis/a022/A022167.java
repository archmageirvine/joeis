package irvine.oeis.a022;

import irvine.oeis.a015.A015109;

/**
 * A022167 Triangle of Gaussian binomial coefficients [ n,k ] for q = 3.
 * @author Sean A. Irvine
 */
public class A022167 extends A015109 {

  @Override
  protected long q() {
    return 3;
  }
}
