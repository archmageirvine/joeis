package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388934 Decimal expansion of ((7-3 * sqrt(5))^(1/8) * exp((3 * Pi) / 8)) / (2^(1/4) * sqrt(5)).
 * @author Sean A. Irvine
 */
public class A388934 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388934() {
    super(1, CR.PI.multiply(new Q(3, 8)).exp().divide(10).multiply(CR.TWO.pow(new Q(27, 40))).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(4, 5)).square()).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).divide(8)).multiply(CR.FIVE.sqrt().subtract(1)).multiply(CR.FIVE.sqrt().add(1)).divide(CrFunctions.GAMMA.cr(new Q(9, 10))).divide(CrFunctions.GAMMA.cr(new Q(7, 10))));
  }
}
