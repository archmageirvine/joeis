package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A389876 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A389876 extends A389877 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

