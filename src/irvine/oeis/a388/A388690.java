package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388690 Decimal expansion of (1/16) * exp(19*Pi/24) * Pi^(3/4) * 2^(1/8) * Gamma(11/12)^(9/2) * Gamma(7/12)^(9/2) * (3^(1/2)-1) / (sqrt(2) * (3^(1/2)-1))^(1/2) / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388690 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388690() {
    super(1, CR.PI.multiply(new Q(19, 24)).exp().divide(16).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(9, 2))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(9, 2))).multiply(CR.THREE.sqrt().subtract(1)).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
