package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388461 Decimal expansion of (-1/72) * exp(35*Pi/24) * Pi^(7/4) * 2^(17/24) * Gamma(11/12)^2 * (-2+3^(1/2)) / Gamma(3/4)^7 / Gamma(5/6).
 * @author Sean A. Irvine
 */
public class A388461 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388461() {
    super(1, CR.PI.multiply(new Q(35, 24)).exp().divide(-72).multiply(CR.PI.pow(new Q(7, 4))).multiply(CR.TWO.pow(new Q(17, 24))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.THREE.sqrt().subtract(2)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)).divide(CrFunctions.GAMMA.cr(new Q(5, 6))));
  }
}
