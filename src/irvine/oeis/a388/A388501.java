package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388501 Decimal expansion of 24 * exp(-Pi / 2) * sqrt(2) * Gamma(3/4)^8 / Pi^2.
 * @author Sean A. Irvine
 */
public class A388501 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388501() {
    super(1, CR.HALF_PI.negate().exp().multiply(24).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)).divide(CR.PI.square()));
  }
}
