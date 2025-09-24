package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388923 Decimal expansion of (1/8) * exp(7*Pi/12) * Gamma(5/8) * sqrt(2) / Pi^(1/4) / Gamma(7/8).
 * @author Sean A. Irvine
 */
public class A388923 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388923() {
    super(1, CR.PI.multiply(new Q(7, 12)).exp().divide(8).multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).multiply(CR.SQRT2).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
