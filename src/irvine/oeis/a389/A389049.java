package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389049 Decimal expansion of (1/128) * Gamma(2/3)^2 * Gamma(5/8)^6 * Gamma(7/12)^2 * (7 * sqrt(2)+10) * (2+3^(1/2)) * sqrt(2) * (2+sqrt(2))^(1/2) / Pi^3 / Gamma(7/8)^6.
 * @author Sean A. Irvine
 */
public class A389049 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389049() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).square().multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(6)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).divide(128).multiply(CR.SQRT2.multiply(7).add(10)).multiply(CR.THREE.sqrt().add(2)).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI.pow(3)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(6)));
  }
}
