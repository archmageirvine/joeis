package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388672 Decimal expansion of (3/8) * exp(Pi/6) * Pi^2 * sqrt(2) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388672 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388672() {
    super(1, CR.PI.divide(6).exp().multiply(new Q(3, 8)).multiply(CR.PI.square()).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
