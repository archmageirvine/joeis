package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388084 Decimal expansion of (1/512) * exp(Pi) * Pi^6 / Gamma(3/4)^24.
 * @author Sean A. Irvine
 */
public class A388084 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388084() {
    super(0, CR.PI.exp().divide(512).multiply(CR.PI.pow(6)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(24)));
  }
}
