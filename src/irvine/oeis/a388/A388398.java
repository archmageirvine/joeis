package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388398 Decimal expansion of (sqrt(3 * (2+sqrt(3))) * Pi^(1/4) * Gamma(7/12)^3 * Gamma(2/3) * Gamma(11/12)^2) / (4 * Gamma(3/4)^8).
 * @author Sean A. Irvine
 */
public class A388398 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388398() {
    super(1, CR.PI.pow(Q.ONE_QUARTER).divide(8).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.SQRT2).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
