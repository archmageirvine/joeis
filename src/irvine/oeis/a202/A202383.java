package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012860;

/**
 * A202383.
 * @author Sean A. Irvine
 */
public class A202383 extends A012860 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
