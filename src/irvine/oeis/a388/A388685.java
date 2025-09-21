package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388685 Decimal expansion of (8/125) * Pi^(3/4) * 2^(3/5) * 5^(1/4) * Gamma(9/10)^3 * Gamma(7/10)^3 * (5+5^(1/2))^3 * (1/4*5^(1/2)-1/4)^3 * (1/4*5^(1/2)+1/4)^3 / Gamma(3/4)^3 / Gamma(4/5)^6.
 * @author Sean A. Irvine
 */
public class A388685 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388685() {
    super(1, CR.PI.pow(new Q(3, 4)).multiply(new Q(8, 125)).multiply(CR.TWO.pow(new Q(3, 5))).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(3)).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(3)).multiply(CR.FIVE.sqrt().subtract(1).divide(4).pow(3)).multiply(CR.FIVE.sqrt().add(1).divide(4).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(6)));
  }
}
