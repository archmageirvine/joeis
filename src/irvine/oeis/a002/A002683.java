package irvine.oeis.a002;

import irvine.math.q.Q;

/**
 * A002683.
 * @author Sean A. Irvine
 */
public class A002683 extends A002681 {

  @Override
  protected Q a(final int n) {
    final Q m = computeM(n);
    final Q r = m.multiply(2L * n).add(mA.multiply(n - 1).divide(2));
    mA = m;
    return r.negate();
  }
}
