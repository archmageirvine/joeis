package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388837 Decimal expansion of (8 * (1+sqrt(2)) * Gamma(5/4)^3) / Pi^(9/4).
 * @author Sean A. Irvine
 */
public class A388837 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388837() {
    super(1, CR.TWO.pow(new Q(3, 4)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).divide(-16).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.SQRT2.subtract(2)).divide(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
