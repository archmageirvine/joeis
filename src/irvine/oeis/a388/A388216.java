package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388216 Decimal expansion of (1/64) * exp(7*Pi/12) * Pi^(7/2) * 2^(3/4) / Gamma(3/4)^14.
 * @author Sean A. Irvine
 */
public class A388216 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388216() {
    super(0, CR.PI.multiply(new Q(7, 12)).exp().divide(64).multiply(CR.PI.pow(new Q(7, 2))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(14)));
  }
}
