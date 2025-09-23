package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389050 Decimal expansion of -(128/15) * (-3+3^(1/2)) * 10^(1/4) * (2-sqrt(2))^(9/2) * (5/2+5^(1/2)) * Pi^4 * Gamma(7/8)^9 / (2+sqrt(2))^(1/2) * (5-5^(1/2))^(3/2) / (5^(1/2)+1)^3 / Gamma(11/12)^2 / Gamma(7/12)^3 / Gamma(5/8)^9 / Gamma(2/3).
 * @author Sean A. Irvine
 */
public class A389050 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389050() {
    super(0, CR.TEN.pow(Q.ONE_QUARTER).multiply(new Q(-128, 15)).multiply(CR.THREE.sqrt().subtract(3)).multiply(CR.TWO.subtract(CR.SQRT2).pow(new Q(9, 2))).multiply(CR.valueOf(new Q(5, 2)).add(CR.FIVE.sqrt())).multiply(CR.PI.pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(9)).divide(CR.TWO.add(CR.SQRT2).sqrt()).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(new Q(3, 2))).divide(CR.FIVE.sqrt().add(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(9)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))));
  }
}
