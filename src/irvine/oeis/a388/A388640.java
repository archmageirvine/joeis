package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388640 Decimal expansion of (1/400) * exp(Pi) * Pi * 5^(1/4) * sqrt(2) * (5-5^(1/2))^(1/2) * (5^(1/2)+1) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388640 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388640() {
    super(0, CR.PI.exp().divide(400).multiply(CR.PI).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CR.SQRT2).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).sqrt()).multiply(CR.FIVE.sqrt().add(1)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
