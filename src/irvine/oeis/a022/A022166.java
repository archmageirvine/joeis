package irvine.oeis.a022;

import irvine.oeis.a015.A015109;

/**
 * A022166 Triangle of Gaussian binomial coefficients (or <code>q-binomial</code> coefficients) <code>[n,k]</code> for q <code>= 2</code>.
 * @author Sean A. Irvine
 */
public class A022166 extends A015109 {

  @Override
  protected long q() {
    return 2;
  }
}
