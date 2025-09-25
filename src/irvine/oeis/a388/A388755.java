package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388755 Decimal expansion of ((-2+sqrt(5)) * exp(Pi)) / 5.
 * @author Sean A. Irvine
 */
public class A388755 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388755() {
    super(1, CR.PI.exp().divide(131072000).multiply(CR.TWO.pow(new Q(4, 5))).multiply(CR.FIVE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(12)).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(6)).multiply(CR.FIVE.sqrt().subtract(1).pow(6)).multiply(CR.FIVE.sqrt().add(1).pow(6)).divide(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(6)).divide(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(6)));
  }
}
