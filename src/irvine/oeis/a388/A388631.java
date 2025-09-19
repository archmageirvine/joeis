package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388631 Decimal expansion of 2 * exp(-Pi/3) * sqrt(2) * Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388631 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388631() {
    super(0, CR.PI.divide(-3).exp().multiply(2).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
