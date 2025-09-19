package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388576 Decimal expansion of (1/51200) * exp(2*Pi/3) * sqrt(Pi) * 2^(11/40) * 5^(3/4) / Gamma(3/4)^2 * Gamma(4/5)^6 * (5-5^(1/2))^3 * (5^(1/2)-1)^3 * (5^(1/2)+1)^3 / Gamma(9/10)^3 / Gamma(7/10)^3.
 * @author Sean A. Irvine
 */
public class A388576 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388576() {
    super(0, CR.PI.multiply(new Q(2, 3)).exp().divide(51200).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(11, 40))).multiply(CR.FIVE.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).multiply(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(6)).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(3)).multiply(CR.FIVE.sqrt().subtract(1).pow(3)).multiply(CR.FIVE.sqrt().add(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(3)));
  }
}
