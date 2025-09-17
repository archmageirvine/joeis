package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388365 Decimal expansion of 64 * exp(-3*Pi/4) * 2^(3/4) * Gamma(3/4)^18 / Pi^(9/2).
 * @author Sean A. Irvine
 */
public class A388365 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388365() {
    super(1, CR.PI.multiply(new Q(-3, 4)).exp().multiply(64).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(18)).divide(CR.PI.pow(new Q(9, 2))));
  }
}
