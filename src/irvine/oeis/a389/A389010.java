package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389010 Decimal expansion of ((1+sqrt(3))^(5/3) * Pi^(5/4) * ((-1+sqrt(3)) / (Gamma(7/12) * Gamma(11/12)))^(3/2)) / (4*2^(7/12) * Gamma(3/4)^2).
 * @author Sean A. Irvine
 */
public class A389010 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389010() {
    super(0, CR.PI.pow(new Q(5, 4)).divide(32).multiply(CR.TWO.pow(new Q(5, 6))).multiply(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(new Q(3, 2))).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(5, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(3, 2))).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(3, 2))));
  }
}
