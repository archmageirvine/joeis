package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388863 Decimal expansion of (1/16) * exp(Pi / 2) * 2^(3/8) * Gamma(5/8)^3 * (1+sqrt(2)) / Gamma(7/8)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388863 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388863() {
    super(0, CR.HALF_PI.exp().multiply(CR.TWO.pow(new Q(-29, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.ONE.add(CR.SQRT2)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
