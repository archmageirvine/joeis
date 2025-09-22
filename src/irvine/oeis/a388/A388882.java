package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388882 Decimal expansion of (1/8) * exp(11*Pi/24) * sqrt(Pi) * 2^(3/8) * Gamma(11/12)^3 * Gamma(7/12)^3 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388882 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388882() {
    super(1, CR.PI.multiply(new Q(11, 24)).exp().divide(8).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(3, 8))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
