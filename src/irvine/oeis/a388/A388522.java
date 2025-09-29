package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388522 Decimal expansion of (5^(1/4)+5^(3/4)) * exp(-Pi/2).
 * @author Sean A. Irvine
 */
public class A388522 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388522() {
    super(1, CR.HALF_PI.negate().exp().multiply(new Q(8, 25)).multiply(CR.TWO.pow(new Q(2, 5))).multiply(CR.FIVE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).square()).multiply(CR.FIVE.add(CR.FIVE.sqrt()).square()).multiply(CR.FIVE.sqrt().subtract(1).divide(4).square()).multiply(CR.FIVE.sqrt().add(1).divide(4).square()).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(4)));
  }
}
