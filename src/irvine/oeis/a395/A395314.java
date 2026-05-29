package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a394.A394466;

/**
 * A395314 allocated for Petro Kolosov.
 * @author Sean A. Irvine
 */
public class A395314 extends A394466 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
