package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388688 Decimal expansion of (1/64) * exp(9*Pi/8) * 2^(1/8) * Gamma(5/8)^3 * (2+sqrt(2))^(1/2) / Pi^(3/4) / Gamma(7/8)^3.
 * @author Sean A. Irvine
 */
public class A388688 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388688() {
    super(1, CR.PI.multiply(new Q(9, 8)).exp().divide(64).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
