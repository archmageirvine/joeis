package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A392571 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A392571 extends A392570 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
