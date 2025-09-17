package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388407 Decimal expansion of exp(-Pi/6) / Pi^(1/4) * 2^(7/8) * Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388407 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388407() {
    super(1, CR.PI.divide(-6).exp().divide(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
