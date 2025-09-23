package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389070 Decimal expansion of 2 * exp(-Pi/12) * 2^(3/4) * Gamma(3/4)^6 / Pi^(3/2).
 * @author Sean A. Irvine
 */
public class A389070 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389070() {
    super(1, CR.PI.divide(-12).exp().multiply(CR.TWO.pow(new Q(7, 4))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)).divide(CR.PI.pow(new Q(3, 2))));
  }
}
