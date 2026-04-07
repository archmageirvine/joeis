package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394036 Rectangular array, read by descending antidiagonals: numerators in the best upper approximating array to the golden ratio, phi (A001622). (See A394035.).
 * @author Sean A. Irvine
 */
public class A394036 extends A394035 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}

