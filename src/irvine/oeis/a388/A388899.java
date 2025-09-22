package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388899 Decimal expansion of -(1/64) * Gamma(5/8)^8 * (17+12 * sqrt(2)) / (sqrt(2)-2) / Pi^2 / Gamma(7/8)^8.
 * @author Sean A. Irvine
 */
public class A388899 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388899() {
    super(0, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(8).divide(-64).multiply(CR.SQRT2.multiply(12).add(17)).divide(CR.SQRT2.subtract(2)).divide(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(8)));
  }
}
