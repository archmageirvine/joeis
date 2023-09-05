package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065553 Triangle of Faulhaber numbers (denominators) read by rows.
 * @author Sean A. Irvine
 */
public class A065553 extends A065551 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
