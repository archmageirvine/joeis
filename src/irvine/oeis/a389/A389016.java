package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389016 Decimal expansion of 4 * exp(-Pi/24) * 2^(1/8) * Gamma(3/4)^8 / Pi^2.
 * @author Sean A. Irvine
 */
public class A389016 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389016() {
    super(1, CR.PI.divide(-24).exp().multiply(CR.TWO.pow(new Q(17, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)).divide(CR.PI.square()));
  }
}
