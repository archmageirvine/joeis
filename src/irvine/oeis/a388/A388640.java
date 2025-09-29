package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388640 Decimal expansion of (32 * sqrt((2 * (1+sqrt(5))) / 5) * Pi * exp(Pi)) / (5 * Gamma(-1/4)^4).
 * @author Sean A. Irvine
 */
public class A388640 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388640() {
    super(0, CR.PI.exp().divide(400).multiply(CR.PI).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CR.SQRT2).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).sqrt()).multiply(CR.FIVE.sqrt().add(1)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
