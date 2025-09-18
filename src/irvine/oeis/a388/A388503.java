package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388503 Decimal expansion of exp(-Pi/8) * 2^(5/8) * Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388503 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388503() {
    super(0, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
