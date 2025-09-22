package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388528 Decimal expansion of 81*Pi*sqrt(110 + 50*sqrt(5))/(5120*Gamma(7/4)^4).
 * @author Sean A. Irvine
 */
public class A388528 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388528() {
    super(1, CR.PI.divide(1250).multiply(CR.TWO.pow(new Q(2, 5))).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).square()).multiply(CR.FIVE.sqrt().subtract(1).divide(4).square()).multiply(CR.FIVE.sqrt().add(1).divide(4).square()).multiply(CR.FIVE.sqrt().multiply(CR.SQRT2).multiply(CR.FIVE.add(CR.FIVE.sqrt()).sqrt()).pow(new Q(11, 2))).divide(CR.SQRT2.multiply(CR.FIVE.sqrt()).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).sqrt()).pow(new Q(3, 2))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(4)));
  }
}
