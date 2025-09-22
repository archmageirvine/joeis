package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388676 Decimal expansion of (1/1250) * exp(Pi / 4) * sqrt(Pi) * 2^(9/10) * Gamma(9/10)^2 * Gamma(7/10)^2 * (1/4*5^(1/2)-1/4)^2 * (1/4*5^(1/2)+1/4)^2*5^(1/2) * (5^(1/2) * sqrt(2) * (5+5^(1/2))^(1/2))^(7/2) * 2 / (sqrt(2) * (5+5^(1/2))^(1/2))^(1/2) / Gamma(3/4)^2 / Gamma(4/5)^4.
 * @author Sean A. Irvine
 */
public class A388676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388676() {
    super(1, CR.PI.divide(4).exp().divide(1250).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(9, 10))).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).square()).multiply(CR.FIVE.sqrt().subtract(1).divide(4).square()).multiply(CR.FIVE.sqrt().add(1).divide(4).square()).multiply(CR.FIVE.sqrt()).multiply(CR.TEN.sqrt().multiply(CR.FIVE.add(CR.FIVE.sqrt()).sqrt()).pow(new Q(7, 2))).multiply(CR.TWO).divide(CR.SQRT2.multiply(CR.FIVE.add(CR.FIVE.sqrt()).sqrt()).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(4)));
  }
}
