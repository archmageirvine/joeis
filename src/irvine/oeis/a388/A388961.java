package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388961 Decimal expansion of (1/32) * exp(2*Pi/3) * Pi^(3/2) * 3^(1/2) * Gamma(11/12)^8 * Gamma(7/12)^7 * (3^(1/2)-1) / Gamma(2/3) / Gamma(3/4)^19.
 * @author Sean A. Irvine
 */
public class A388961 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388961() {
    super(0, CR.PI.multiply(new Q(2, 3)).exp().divide(32).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(8)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(7)).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(19)));
  }
}
