package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388793 Decimal expansion of (1/32) * exp(7*Pi/8) * Pi^(7/4) * 2^(5/8) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388793 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388793() {
    super(1, CR.PI.multiply(new Q(7, 8)).exp().divide(32).multiply(CR.PI.pow(new Q(7, 4))).multiply(CR.TWO.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
