package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389046 Decimal expansion of (32/9) * Pi^(15/4) * 3^(1/2) * Gamma(7/8)^8 * (2-sqrt(2))^(1/2) / (1+3^(1/2)) / Gamma(5/8)^8 / Gamma(7/12)^3 / (17/12+sqrt(2)) / Gamma(11/12)^2 / Gamma(2/3).
 * @author Sean A. Irvine
 */
public class A389046 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389046() {
    super(0, CR.PI.pow(new Q(15, 4)).multiply(32).divide(9).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(8)).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(8)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).divide(CR.valueOf(new Q(17, 12)).add(CR.SQRT2)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(2, 3))));
  }
}
