package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A071265.
 * @author Sean A. Irvine
 */
public class A072045 extends A072044 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

