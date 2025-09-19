package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388588 Decimal expansion of (1/8) * exp(3*Pi/8) * Pi^(3/2) * 2^(1/8) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388588 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388588() {
    super(0, CR.PI.multiply(new Q(3, 8)).exp().divide(8).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
