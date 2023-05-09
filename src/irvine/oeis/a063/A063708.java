package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A063708 Cyclotomic polynomials Phi_n at x=phi divided by sqrt(5) and ceiled up (where phi = tau = (sqrt(5)+1)/2).
 * @author Sean A. Irvine
 */
public class A063708 extends A063704 {

  @Override
  protected Z select(final CR n) {
    return n.ceil();
  }
}
