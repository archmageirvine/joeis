package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388909 Decimal expansion of (1/8) * exp(5*Pi/8) * 2^(1/4) * Gamma(5/8) / Pi^(1/4) / Gamma(7/8).
 * @author Sean A. Irvine
 */
public class A388909 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388909() {
    super(1, CR.PI.multiply(new Q(5, 8)).exp().divide(8).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
