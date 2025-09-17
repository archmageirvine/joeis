package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388358 Decimal expansion of 8 * exp(-5*Pi/12) * 2^(3/4) * Gamma(3/4)^10 / Pi^(5/2).
 * @author Sean A. Irvine
 */
public class A388358 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388358() {
    super(1, CR.PI.multiply(new Q(-5, 12)).exp().multiply(CR.TWO.pow(new Q(15, 4))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)).divide(CR.PI.pow(new Q(5, 2))));
  }
}
