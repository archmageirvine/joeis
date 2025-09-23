package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389069 Decimal expansion of exp(-Pi/24) * 2^(7/8) * Gamma(3/4)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A389069 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389069() {
    super(1, CR.PI.divide(-24).exp().multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
