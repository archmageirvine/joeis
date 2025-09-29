package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388628 Decimal expansion of (64 * sqrt(20+14 * sqrt(2)) * Gamma(5/4)^6) / Pi^(9/2).
 * @author Sean A. Irvine
 */
public class A388628 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388628() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(6).divide(-64).multiply(CR.SEVEN.multiply(CR.SQRT2).add(10)).multiply(CR.SQRT2).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI.pow(new Q(3, 2))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(6)).divide(CR.SQRT2.subtract(2)));
  }
}
