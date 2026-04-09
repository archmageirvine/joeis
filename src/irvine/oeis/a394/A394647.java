package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394647 Rectangular array, read by descending antidiagonals: numerators in the best approximating array to the golden ratio, phi (A001622). See A394037.
 * @author Sean A. Irvine
 */
public class A394647 extends A394037 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}

