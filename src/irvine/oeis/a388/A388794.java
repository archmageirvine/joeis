package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388794 Decimal expansion of (1/64) * exp(9*Pi/8) * Pi^(9/4) * 2^(3/8) / Gamma(3/4)^9.
 * @author Sean A. Irvine
 */
public class A388794 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388794() {
    super(1, CR.PI.multiply(new Q(9, 8)).exp().divide(64).multiply(CR.PI.pow(new Q(9, 4))).multiply(CR.TWO.pow(new Q(3, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(9)));
  }
}
