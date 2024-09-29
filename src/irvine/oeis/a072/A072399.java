package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072399 extends A072398 {

  protected Z select(final Q n) {
    return n.den();
  }
}
