package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388837 Decimal expansion of -(1/16) * 2^(3/4) * Gamma(5/8)^3 * (2+sqrt(2))^(3/2) / (sqrt(2)-2) / Pi^(3/4) / Gamma(7/8)^3.
 * @author Sean A. Irvine
 */
public class A388837 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388837() {
    super(1, CR.TWO.pow(new Q(3, 4)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).divide(-16).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.SQRT2.subtract(2)).divide(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
