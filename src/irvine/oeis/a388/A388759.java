package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388759 Decimal expansion of (1/24) * exp(17*Pi/24) * Pi^(5/4) * 2^(5/8) * 3^(1/2) * Gamma(11/12) * (3^(1/2)-1) / Gamma(2/3) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388759 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388759() {
    super(1, CR.PI.multiply(new Q(17, 24)).exp().divide(24).multiply(CR.PI.pow(new Q(5, 4))).multiply(CR.TWO.pow(new Q(5, 8))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
