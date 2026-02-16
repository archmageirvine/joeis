package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A393017 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A393017 extends A393016 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
