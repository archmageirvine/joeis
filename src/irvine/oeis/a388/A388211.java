package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388211 Decimal expansion of (1/4) * exp(Pi / 8) * Pi^(3/4) * 2^(7/8) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388211 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388211() {
    super(0, CR.PI.divide(8).exp().divide(4).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
