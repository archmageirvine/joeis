package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388368 Decimal expansion of 128 * exp(-7*Pi/8) * 2^(7/8) * Gamma(3/4)^21 / Pi^(21/4).
 * @author Sean A. Irvine
 */
public class A388368 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388368() {
    super(1, CR.PI.multiply(new Q(-7, 8)).exp().multiply(128).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(21)).divide(CR.PI.pow(new Q(21, 4))));
  }
}
