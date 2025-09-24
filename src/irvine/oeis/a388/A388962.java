package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388962 Decimal expansion of exp(Pi / 24) * Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388962 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388962() {
    super(1, CR.PI.divide(24).exp().multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
