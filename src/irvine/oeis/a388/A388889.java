package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388889 Decimal expansion of (2/3) * 3^(1/2) * Gamma(2/3) * Gamma(3/4)^3 / sqrt(Pi) * exp(-Pi/12) / Gamma(11/12)^2 / Gamma(7/12) / (3^(1/2)-1).
 * @author Sean A. Irvine
 */
public class A388889 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388889() {
    super(1, CR.THREE.sqrt().multiply(2).divide(3).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.SQRT_PI).multiply(CR.PI.divide(-12).exp()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CR.THREE.sqrt().subtract(1)));
  }
}
