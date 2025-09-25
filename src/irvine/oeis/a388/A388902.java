package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388902 Decimal expansion of -1/6 * ((-3+sqrt(3)) * exp(Pi / 2) * Gamma(7/12)^3 * Gamma(11/12)^4) / (Gamma(2/3) * Gamma(3/4)^5).
 * @author Sean A. Irvine
 */
public class A388902 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388902() {
    super(1, CR.HALF_PI.exp().divide(6).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
