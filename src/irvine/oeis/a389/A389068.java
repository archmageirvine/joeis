package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389068 Decimal expansion of 4 * exp(-Pi/6) * 2^(1/4) * Gamma(3/4)^7 / Pi^(7/4).
 * @author Sean A. Irvine
 */
public class A389068 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389068() {
    super(1, CR.PI.divide(-6).exp().multiply(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)).divide(CR.PI.pow(new Q(7, 4))));
  }
}
