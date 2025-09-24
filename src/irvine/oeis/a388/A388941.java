package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388941 Decimal expansion of 4 * exp(-Pi/3) * Gamma(3/4)^6 / Gamma(11/12)^3 / Gamma(7/12)^3.
 * @author Sean A. Irvine
 */
public class A388941 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388941() {
    super(1, CR.PI.divide(-3).exp().multiply(4).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)));
  }
}
