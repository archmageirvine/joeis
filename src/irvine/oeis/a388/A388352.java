package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388352 Decimal expansion of 2 * exp(-5*Pi/24) * 2^(7/8) * Gamma(3/4)^5 / Pi^(5/4).
 * @author Sean A. Irvine
 */
public class A388352 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388352() {
    super(1, CR.PI.multiply(new Q(-5, 24)).exp().multiply(CR.TWO.pow(new Q(15, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)).divide(CR.PI.pow(new Q(5, 4))));
  }
}
