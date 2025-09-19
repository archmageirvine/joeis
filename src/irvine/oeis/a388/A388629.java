package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388629 Decimal expansion of 2 * exp(-Pi/3) * 2^(3/4) * Gamma(3/4) / Pi^(1/4).
 * @author Sean A. Irvine
 */
public class A388629 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388629() {
    super(1, CR.PI.divide(-3).exp().multiply(CR.TWO.pow(new Q(7, 4))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.PI.pow(Q.ONE_QUARTER)));
  }
}
