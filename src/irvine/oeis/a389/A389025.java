package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389025 Decimal expansion of (1/54) * exp(Pi) * 3^(3/4) * Pi^2 * (3^(1/2)-1) / Gamma(2/3) / Gamma(3/4)^5 / Gamma(7/12).
 * @author Sean A. Irvine
 */
public class A389025 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389025() {
    super(1, CR.PI.exp().divide(54).multiply(CR.THREE.pow(new Q(3, 4))).multiply(CR.PI.square()).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)).divide(CrFunctions.GAMMA.cr(new Q(7, 12))));
  }
}
