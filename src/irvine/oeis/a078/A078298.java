package irvine.oeis.a078;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A078298 Triangle of denominators of Integral_{x=0..1} LegendreP(m,x) * LegendreP(n,x) dx.
 * @author Sean A. Irvine
 */
public class A078298 extends A078297 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

