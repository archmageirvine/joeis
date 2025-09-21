package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388692 Decimal expansion of -(1/400000000) * exp(33*Pi/8) * Pi^(9/4) * 2^(3/8) * (-5+5^(1/2))^5*5^(1/2) / Gamma(3/4)^9.
 * @author Sean A. Irvine
 */
public class A388692 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388692() {
    super(1, CR.PI.multiply(new Q(33, 8)).exp().divide(-400000000).multiply(CR.PI.pow(new Q(9, 4))).multiply(CR.TWO.pow(new Q(3, 8))).multiply(CR.FIVE.sqrt().subtract(5).pow(5)).multiply(CR.FIVE.sqrt()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(9)));
  }
}
