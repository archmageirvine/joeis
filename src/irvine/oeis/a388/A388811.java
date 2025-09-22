package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388811 Decimal expansion of (1/16) * exp(Pi / 2) * Pi^(3/2) * 2^(3/4) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388811 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388811() {
    super(0, CR.HALF_PI.exp().divide(16).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
