package irvine.oeis.a091;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a013.A013523;

/**
 * A091912.
 * @author Sean A. Irvine
 */
public class A091912 extends A013523 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
