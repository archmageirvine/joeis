package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388557 Decimal expansion of (1/36) * exp(Pi) * Pi^2*3^(1/2) * Gamma(11/12)^3 * sqrt(2) * (3^(1/2)-1)^3 / Gamma(2/3)^3 / Gamma(3/4)^5.
 * @author Sean A. Irvine
 */
public class A388557 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388557() {
    super(1, CR.PI.exp().divide(36).multiply(CR.PI.square()).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
