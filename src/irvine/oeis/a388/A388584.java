package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388584 Decimal expansion of (sqrt((-1+sqrt(3)) * Pi) * exp((11 * Pi) / 24) * (Gamma(7/12) * Gamma(11/12))^(3/2)) / (4*2^(1/8) * Gamma(3/4)^5).
 * @author Sean A. Irvine
 */
public class A388584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388584() {
    super(1, CR.PI.multiply(new Q(11, 24)).exp().divide(4).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(3, 2))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(3, 2))).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).sqrt()));
  }
}
