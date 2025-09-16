package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388168 Decimal expansion of (1/2) * exp(Pi / 2) * Pi^(3/4) * sqrt(2) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388168 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388168() {
    super(1, CR.HALF_PI.exp().divide(2).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
