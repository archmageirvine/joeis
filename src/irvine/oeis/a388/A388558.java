package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388558 Decimal expansion of (2 * sqrt(2) * (-3+sqrt(3)) * Pi * Gamma(3/4)^3) / (Gamma(-1/3) * Gamma(7/12)^3 * Gamma(11/12)^2).
 * @author Sean A. Irvine
 */
public class A388558 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388558() {
    super(1, CR.PI.multiply(new Q(2, 3)).multiply(CR.THREE.sqrt()).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)));
  }
}
