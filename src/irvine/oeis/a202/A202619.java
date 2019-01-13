package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012863;

/**
 * A202619.
 * @author Sean A. Irvine
 */
public class A202619 extends A012863 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
