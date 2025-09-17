package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388239 Decimal expansion of 1/16 / Pi^(3/4) * 2^(3/4) / Gamma(7/8)^3 * Gamma(5/8)^3 * (2+sqrt(2))^2.
 * @author Sean A. Irvine
 */
public class A388239 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388239() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3).multiply(CR.TWO.add(CR.SQRT2).square()).divide(16).divide(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
