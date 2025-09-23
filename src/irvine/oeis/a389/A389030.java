package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389030 Decimal expansion of 4 * exp(-Pi/24) * 2^(3/8) * Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A389030 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389030() {
    super(1, CR.PI.divide(-24).exp().multiply(CR.TWO.pow(new Q(19, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
