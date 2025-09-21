package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388669 Decimal expansion of (1/100) * exp(Pi / 4) * 2^(19/20) * 5^(3/4) * Gamma(9/10) * Gamma(7/10) * (5+5^(1/2)) / Gamma(4/5)^2.
 * @author Sean A. Irvine
 */
public class A388669 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388669() {
    super(1, CR.PI.divide(4).exp().divide(100).multiply(CR.TWO.pow(new Q(19, 20))).multiply(CR.FIVE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(9, 10))).multiply(CrFunctions.GAMMA.cr(new Q(7, 10))).multiply(CR.FIVE.add(CR.FIVE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).square()));
  }
}
