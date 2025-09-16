package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388222 Decimal expansion of (1/256) * exp(7*Pi/8) * Pi^(21/4) * 2^(1/8) / Gamma(3/4)^21.
 * @author Sean A. Irvine
 */
public class A388222 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388222() {
    super(0, CR.PI.multiply(new Q(7, 8)).exp().divide(256).multiply(CR.PI.pow(new Q(21, 4))).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(21)));
  }
}
