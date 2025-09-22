package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388836 Decimal expansion of -(1/16) * (3/2+sqrt(2)) * 2^(3/4) * (2+sqrt(2))^(1/2) * Gamma(5/8)^5 / Pi^(5/4) / Gamma(7/8)^5 / (sqrt(2)-2).
 * @author Sean A. Irvine
 */
public class A388836 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388836() {
    super(0, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(5).divide(-16).multiply(CR.valueOf(new Q(3, 2)).add(CR.SQRT2)).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.TWO.add(CR.SQRT2).sqrt().divide(CR.PI.pow(new Q(5, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(5)).divide(CR.SQRT2.subtract(2))));
  }
}
