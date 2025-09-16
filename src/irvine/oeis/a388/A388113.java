package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388113 Decimal expansion of (1/8) * 2^(3/4) * Gamma(5/8) * exp(1/2 * Pi) / Pi^(1/4) / Gamma(7/8).
 * @author Sean A. Irvine
 */
public class A388113 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388113() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).divide(8).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.HALF_PI.exp()).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
