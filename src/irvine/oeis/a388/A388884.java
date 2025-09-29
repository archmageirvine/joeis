package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388884 Decimal expansion of ((-1+sqrt(3)) * Pi^(5/4) * exp((2 * Pi) / 3) * Gamma(7/12)^3 * Gamma(11/12)^4) / (4 * sqrt(6) * Gamma(2/3) * Gamma(3/4)^10).
 * @author Sean A. Irvine
 */
public class A388884 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388884() {
    super(1, CR.PI.multiply(new Q(2, 3)).exp().divide(24).multiply(CR.PI.pow(new Q(5, 4))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
