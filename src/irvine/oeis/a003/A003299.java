package irvine.oeis.a003;

import irvine.math.q.Q;

/**
 * A003299.
 * @author Sean A. Irvine
 */
public class A003299 extends A003284 {

  @Override
  protected Q b0() {
    return Q.ZERO;
  }

  @Override
  protected Q b1() {
    return Q.ONE;
  }
}
