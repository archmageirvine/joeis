package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388632 Decimal expansion of ((-1+sqrt(5)) * Pi * exp(Pi) * ((Pi * Gamma(9/10)) / Gamma(7/10))^(1/3)) / (10*2^(8/15) * 5^(7/12) * Gamma(3/5)^(2/3) * Gamma(3/4)^4).
 * @author Sean A. Irvine
 */
public class A388632 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388632() {
    super(1, CR.PI.exp().divide(200).multiply(CR.PI.pow(new Q(4, 3))).multiply(CR.TWO.pow(new Q(4, 5))).multiply(CR.FIVE.sqrt().add(1).pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(Q.ONE_THIRD)).multiply(CR.FIVE.sqrt().subtract(1).pow(new Q(4, 3))).multiply(CR.FIVE.pow(new Q(5, 12))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(3, 5)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(Q.ONE_THIRD)));
  }
}
