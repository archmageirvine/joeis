package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388878 Decimal expansion of 3/2 * exp(-Pi/6) * Gamma(11/12) * Gamma(7/12) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388878 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388878() {
    super(0, CR.PI.divide(-6).exp().multiply(3).divide(2).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
