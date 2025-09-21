package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388683 Decimal expansion of -(8/3) * Pi^2 * exp(2*Pi/3) * (-7/4+3^(1/2)) * 3^(1/2) * Gamma(11/12)^4 / Gamma(2/3)^4 / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388683 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388683() {
    super(1, CR.PI.square().multiply(new Q(-8, 3)).multiply(CR.PI.multiply(new Q(2, 3)).exp()).multiply(CR.THREE.sqrt().subtract(CR.valueOf(new Q(7, 4)))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
