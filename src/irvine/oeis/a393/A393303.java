package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A393303 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A393303 extends A393302 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
