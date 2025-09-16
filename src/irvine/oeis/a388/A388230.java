package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388230 Decimal expansion of (1/4096) * exp(5*Pi/4) * Pi^(15/2) * 2^(3/4) / Gamma(3/4)^30.
 * @author Sean A. Irvine
 */
public class A388230 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388230() {
    super(0, CR.PI.multiply(new Q(5, 4)).exp().divide(4096).multiply(CR.PI.pow(new Q(15, 2))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(30)));
  }
}
