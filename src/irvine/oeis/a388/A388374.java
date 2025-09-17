package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388374 Decimal expansion of (1/256) * 3^(1/2) * Gamma(2/3) * Gamma(5/8)^8 * Gamma(11/12)^2 * Gamma(7/12)^3 * (17+12 * sqrt(2)) * (1+3^(1/2)) * sqrt(2) * (2+sqrt(2))^(1/2) / Pi^(15/4) / Gamma(7/8)^8.
 * @author Sean A. Irvine
 */
public class A388374 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388374() {
    super(1, CR.THREE.sqrt().divide(256).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(8)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.valueOf(17).add(CR.SQRT2.multiply(12))).multiply(CR.ONE.add(CR.THREE.sqrt())).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2)).sqrt().divide(CR.PI.pow(new Q(15, 4)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(8))));
  }
}
