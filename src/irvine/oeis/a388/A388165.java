package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388165 Decimal expansion of (1/2) * exp(3*Pi/8) * Pi^(3/4) * 2^(1/8) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388165 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388165() {
    super(1, CR.PI.multiply(new Q(3, 8)).exp().divide(2).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
