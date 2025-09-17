package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388406 Decimal expansion of exp(-Pi/12) / Pi^(1/4) * sqrt(2) * Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388406 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388406() {
    super(1, CR.PI.divide(-12).exp().divide(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
