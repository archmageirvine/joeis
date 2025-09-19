package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388190 Decimal expansion of (1/16) * exp(5*Pi/8) * Pi^(5/4) * 2^(7/8) / Gamma(3/4)^5.
 * @author Sean A. Irvine
 */
public class A388190 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388190() {
    super(1, CR.PI.multiply(new Q(5, 8)).exp().divide(16).multiply(CR.PI.pow(new Q(5, 4))).multiply(CR.TWO.pow(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
