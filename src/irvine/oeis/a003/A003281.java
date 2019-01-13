package irvine.oeis.a003;

import irvine.math.q.Q;

/**
 * A003281.
 * @author Sean A. Irvine
 */
public class A003281 extends A003280 {

  @Override
  protected Q b0() {
    return Q.ZERO;
  }

  @Override
  protected Q b1() {
    return Q.ONE;
  }
}
