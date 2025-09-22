package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388817 Decimal expansion of 4 * exp(-Pi / 2) * sqrt(2) * Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388817 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388817() {
    super(1, CR.HALF_PI.negate().exp().multiply(4).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
