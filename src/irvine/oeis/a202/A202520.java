package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012858;

/**
 * A202520.
 * @author Sean A. Irvine
 */
public class A202520 extends A012858 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
