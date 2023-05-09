package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A063707 Cyclotomic polynomials Phi_n at x=phi, ceiled up (where phi = tau = (sqrt(5)+1)/2).
 * @author Sean A. Irvine
 */
public class A063707 extends A063703 {

  @Override
  protected Z select(final CR n) {
    return n.ceil();
  }
}
