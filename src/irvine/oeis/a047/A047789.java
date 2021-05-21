package irvine.oeis.a047;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A047789 Denominators of Glaisher's I-numbers.
 * @author Sean A. Irvine
 */
public class A047789 extends A047788 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
