package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388517 Decimal expansion of (64/125) * exp(-Pi) * 2^(4/5) * 5^(1/2) * Gamma(9/10)^4 * Gamma(7/10)^4 * (5+5^(1/2))^4 * (1/4*5^(1/2)-1/4)^4 * (1/4*5^(1/2)+1/4)^4 / Gamma(4/5)^8.
 * @author Sean A. Irvine
 */
public class A388517 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388517() {
    super(1, CR.PI.negate().exp().multiply(new Q(64, 125)).multiply(CR.TWO.pow(new Q(4, 5))).multiply(CR.FIVE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(4)).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(4)).multiply(CR.FIVE.sqrt().subtract(1).divide(4).pow(4)).multiply(CR.FIVE.sqrt().add(1).divide(4).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(8)));
  }
}
