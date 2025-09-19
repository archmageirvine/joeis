package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388575 Decimal expansion of (1/4) * exp(Pi / 3) * sqrt(Pi) * Gamma(11/12)^3 * Gamma(7/12)^3 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388575 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388575() {
    super(1, CR.PI.divide(3).exp().divide(4).multiply(CR.SQRT_PI).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
