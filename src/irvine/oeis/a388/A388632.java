package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388632 Decimal expansion of 1/200 * exp(Pi) * Pi^(4/3) * 2^(4/5) * (5^(1/2)+1)^(1/3) * Gamma(9/10)^(1/3) * (5^(1/2)-1)^(4/3) * 5^(5/12) / Gamma(3/4)^4 / Gamma(3/5)^(2/3) / Gamma(7/10)^(1/3).
 * @author Sean A. Irvine
 */
public class A388632 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388632() {
    super(1, CR.PI.exp().divide(200).multiply(CR.PI.pow(new Q(4, 3))).multiply(CR.TWO.pow(new Q(4, 5))).multiply(CR.FIVE.sqrt().add(1).pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(Q.ONE_THIRD)).multiply(CR.FIVE.sqrt().subtract(1).pow(new Q(4, 3))).multiply(CR.FIVE.pow(new Q(5, 12))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(3, 5)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(Q.ONE_THIRD)));
  }
}
