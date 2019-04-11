package irvine.oeis.a022;

import irvine.oeis.a015.A015109;

/**
 * A022169 Triangle of Gaussian binomial coefficients <code>[ n,k ]</code> for q <code>= 5</code>.
 * @author Sean A. Irvine
 */
public class A022169 extends A015109 {

  @Override
  protected long q() {
    return 5;
  }
}
