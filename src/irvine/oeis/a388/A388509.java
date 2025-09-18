package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388509 Decimal expansion of -(3/16) * exp(Pi) * Pi^2 * Gamma(11/12)^10 * Gamma(7/12)^6 * (-7+4*3^(1/2)) / Gamma(2/3)^4 / Gamma(3/4)^16.
 * @author Sean A. Irvine
 */
public class A388509 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388509() {
    super(0, CR.PI.exp().multiply(new Q(-3, 16)).multiply(CR.PI.square()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(10)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(6)).multiply(CR.THREE.sqrt().multiply(4).subtract(7)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(16)));
  }
}
