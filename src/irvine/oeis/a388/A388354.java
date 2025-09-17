package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388354 Decimal expansion of 4 * exp(-7*Pi/24) * 2^(5/8) * Gamma(3/4)^7 / Pi^(7/4).
 * @author Sean A. Irvine
 */
public class A388354 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388354() {
    super(1, CR.PI.multiply(new Q(-7, 24)).exp().multiply(CR.TWO.pow(new Q(21, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)).divide(CR.PI.pow(new Q(7, 4))));
  }
}
