package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058816 Denominators in expansion of exp(exp(x)-1)/(2-x).
 * @author Sean A. Irvine
 */
public class A058816 extends A058815 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
