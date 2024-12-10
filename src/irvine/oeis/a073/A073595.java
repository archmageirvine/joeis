package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073595 extends A073594 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
