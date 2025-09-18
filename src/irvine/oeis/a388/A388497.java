package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388497 Decimal expansion of exp(-Pi/12) * 2^(5/8) * Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388497 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388497() {
    super(1, CR.PI.divide(-12).exp().multiply(CR.TWO.pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
