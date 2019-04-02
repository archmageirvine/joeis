package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A003515 Number of series-reduced connected labeled graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003515 extends A003514 {

  @Override
  protected Polynomial<Q> egf(final int n) {
    return RING.log(super.egf(n), n);
  }
}
