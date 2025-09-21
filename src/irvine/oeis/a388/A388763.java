package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388763 Decimal expansion of (1/32) * exp(3*Pi/4) * sqrt(2) * Gamma(5/8)^3 * (1+sqrt(2)) / Pi^(3/4) / Gamma(7/8)^3.
 * @author Sean A. Irvine
 */
public class A388763 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388763() {
    super(1, CR.PI.multiply(new Q(3, 4)).exp().divide(32).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.ONE.add(CR.SQRT2)).divide(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
