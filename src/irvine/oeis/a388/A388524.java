package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388524 Decimal expansion of sqrt(3+sqrt(5)) * exp(-Pi/4).
 * @author Sean A. Irvine
 */
public class A388524 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388524() {
    super(1, CR.PI.divide(-4).exp().multiply(new Q(4, 25)).multiply(CR.TWO.pow(new Q(9, 10))).multiply(CR.FIVE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).square()).multiply(CR.FIVE.add(CR.FIVE.sqrt()).square()).multiply(CR.FIVE.sqrt().subtract(1).divide(4).square()).multiply(CR.FIVE.sqrt().add(1).divide(4).square()).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(4)));
  }
}
