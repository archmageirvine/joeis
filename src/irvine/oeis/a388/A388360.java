package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388360 Decimal expansion of 16 * exp(-13*Pi/24) * 2^(7/8) * Gamma(3/4)^13 / Pi^(13/4).
 * @author Sean A. Irvine
 */
public class A388360 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388360() {
    super(1, CR.PI.multiply(new Q(-13, 24)).exp().multiply(16).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(13)).divide(CR.PI.pow(new Q(13, 4))));
  }
}
