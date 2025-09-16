package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388223 Decimal expansion of (1/512) * exp(11*Pi/12) * Pi^(11/2) * 2^(3/4) / Gamma(3/4)^22.
 * @author Sean A. Irvine
 */
public class A388223 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388223() {
    super(0, CR.PI.multiply(new Q(11, 12)).exp().divide(512).multiply(CR.PI.pow(new Q(11, 2))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(22)));
  }
}
