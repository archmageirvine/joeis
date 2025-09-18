package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388448 Decimal expansion of 4 * exp(-Pi / 2) * Gamma(3/4)^2 / Gamma(11/12) / Gamma(7/12).
 * @author Sean A. Irvine
 */
public class A388448 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388448() {
    super(0, CR.HALF_PI.negate().exp().multiply(4).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CrFunctions.GAMMA.cr(new Q(7, 12))));
  }
}
