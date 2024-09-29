package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072404 extends A072403 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
