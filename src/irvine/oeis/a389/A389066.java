package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389066 Decimal expansion of 2 * exp(-Pi/12) * Gamma(3/4)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A389066 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389066() {
    super(1, CR.PI.divide(-12).exp().multiply(2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
