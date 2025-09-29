package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388910 Decimal expansion of ((2+sqrt(3)) * exp(-Pi/24) * Gamma(7/12)^2 * Gamma(2/3)^2) / (2 * (2 * Pi)^(3/4) * Gamma(3/4)^3).
 * @author Sean A. Irvine
 */
public class A388910 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388910() {
    super(0, CR.TWO.pow(new Q(-7, 4)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).multiply(CR.TWO.add(CR.THREE.sqrt())).multiply(CR.PI.divide(-24).exp()).divide(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
