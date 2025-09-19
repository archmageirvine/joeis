package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388599 Decimal expansion of (1/4) * exp(-Pi/8) * 2^(3/4) * Gamma(5/8) * (2+sqrt(2)) / Pi^(1/4) / Gamma(7/8).
 * @author Sean A. Irvine
 */
public class A388599 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388599() {
    super(0, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(-5, 4))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).multiply(CR.TWO.add(CR.SQRT2)).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
