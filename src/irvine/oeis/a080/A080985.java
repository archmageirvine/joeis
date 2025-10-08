package irvine.oeis.a080;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080985 extends A080984 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

