package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388388 Decimal expansion of (1/512) * exp(Pi) * sqrt(2) * Gamma(5/8)^6 * (7 * sqrt(2)+10) * (2-sqrt(2))^(1/2) / Pi^(3/2) / Gamma(7/8)^6.
 * @author Sean A. Irvine
 */
public class A388388 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388388() {
    super(0, CR.PI.exp().divide(512).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(6)).multiply(CR.SEVEN.multiply(CR.SQRT2).add(10)).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.PI.pow(new Q(3, 2))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(6)));
  }
}
