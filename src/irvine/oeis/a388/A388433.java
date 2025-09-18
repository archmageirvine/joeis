package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388433 Decimal expansion of (1/4) * exp(Pi / 2) * Pi^2 * sqrt(2) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388433 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388433() {
    super(1, CR.HALF_PI.exp().divide(4).multiply(CR.PI.square()).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
