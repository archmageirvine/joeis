package irvine.oeis.a023;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A023418 Denominator of <code>n*(n-3)*(3*n^2 - 6*n + 2)/(3*(n-1)*(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A023418 extends A023417 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
