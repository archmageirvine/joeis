package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389055 Decimal expansion of -(1/6400) * 3^(1/2) * 5^(3/4) * Pi^(1/4) * Gamma(2/3) * Gamma(7/12)^3 * Gamma(11/12)^2 * (1+3^(1/2))^3 * (-2+3^(1/2)) * (5-5^(1/2))^(3/2) * (5^(1/2)+1)^3 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A389055 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389055() {
    super(1, CR.THREE.sqrt().divide(-6400).multiply(CR.FIVE.pow(new Q(3, 4))).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.ONE.add(CR.THREE.sqrt()).pow(3)).multiply(CR.THREE.sqrt().subtract(2)).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(new Q(3, 2))).multiply(CR.FIVE.sqrt().add(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
