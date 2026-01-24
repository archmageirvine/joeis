package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A066531.
 * @author Sean A. Irvine
 */
public class A392686 extends A392685 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
