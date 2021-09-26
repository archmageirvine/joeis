package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051727 Denominator of n(n-1)(n-2)/720.
 * @author Sean A. Irvine
 */
public class A051727 extends A051726 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
