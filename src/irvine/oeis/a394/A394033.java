package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394033 Rectangular array, read by descending antidiagonals: denominators in the best lower approximating array to the golden ratio, phi (A001622). (See Comments).
 * @author Sean A. Irvine
 */
public class A394033 extends A394034 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

