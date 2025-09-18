package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388466 Decimal expansion of 262144 * exp(-2 * Pi) * Gamma(3/4)^48 / Pi^12.
 * @author Sean A. Irvine
 */
public class A388466 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388466() {
    super(1, CR.TAU.negate().exp().multiply(262144).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(48)).divide(CR.PI.pow(12)));
  }
}
