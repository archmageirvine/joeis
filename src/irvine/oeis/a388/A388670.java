package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388670 Decimal expansion of 5 * (2+sqrt(5)) * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388670 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388670() {
    super(0, CR.PI.negate().exp().multiply(new Q(128, 625)).multiply(CR.TWO.pow(new Q(1, 5))).multiply(CR.FIVE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(6)).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(6)).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(6)).multiply(CR.FIVE.sqrt().subtract(1).divide(4).pow(6)).multiply(CR.FIVE.sqrt().add(1).divide(4).pow(6)).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(12)));
  }
}
