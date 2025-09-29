package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388636 Decimal expansion of (64 * sqrt(10 * (-1+sqrt(5))) * Pi) / Gamma(-1/4)^4.
 * @author Sean A. Irvine
 */
public class A388636 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388636() {
    super(1, CR.PI.divide(-8).multiply(CR.TWO.pow(new Q(4, 5))).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(4, 5)).square()).multiply(CR.FIVE.sqrt().subtract(5)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(9, 10))).divide(CrFunctions.GAMMA.cr(new Q(7, 10))));
  }
}
