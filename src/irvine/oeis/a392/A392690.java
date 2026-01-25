package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A392690 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A392690 extends A392689 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
