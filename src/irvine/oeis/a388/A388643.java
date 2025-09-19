package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388643 Decimal expansion of (1/2) * sqrt(Pi) * 2^(7/8) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388643 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388643() {
    super(1, CR.SQRT_PI.multiply(CR.TWO.pow(new Q(-1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
