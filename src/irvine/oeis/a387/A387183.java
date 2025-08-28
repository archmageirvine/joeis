package irvine.oeis.a387;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a384.A384229;

/**
 * A387183 allocated for Joost de Winter.
 * @author Sean A. Irvine
 */
public class A387183 extends A384229 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

