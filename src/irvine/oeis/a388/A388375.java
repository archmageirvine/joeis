package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388375 Decimal expansion of Pi^(3/4) * 2^(1/5) * Gamma(9/10) * Gamma(7/10) * (2+2/5*5^(1/2)) * (1/4*5^(1/2)-1/4) * (1/4*5^(1/2)+1/4) / Gamma(3/4)^3 / Gamma(4/5)^2.
 * @author Sean A. Irvine
 */
public class A388375 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388375() {
    super(1, CR.PI.pow(new Q(3, 4)).multiply(CR.TWO.pow(new Q(1, 5))).multiply(CrFunctions.GAMMA.cr(new Q(9, 10))).multiply(CrFunctions.GAMMA.cr(new Q(7, 10))).multiply(CR.TWO.add(CR.FIVE.sqrt().multiply(new Q(2, 5)))).multiply(CR.FIVE.sqrt().subtract(1).divide(4)).multiply(CR.FIVE.sqrt().add(1).divide(4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).square()));
  }
}
