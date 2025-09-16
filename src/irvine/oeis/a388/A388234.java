package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388234 Decimal expansion of (1/262144) * exp(2 * Pi) * Pi^12 / Gamma(3/4)^48.
 * @author Sean A. Irvine
 */
public class A388234 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388234() {
    super(0, CR.TAU.exp().divide(262144).multiply(CR.PI.pow(12)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(48)));
  }
}
