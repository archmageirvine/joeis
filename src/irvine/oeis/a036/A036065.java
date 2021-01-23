package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A036065 Triangle of flag coefficients [ n k ] (denominators of rational parts).
 * @author Sean A. Irvine
 */
public class A036065 extends A036064 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
