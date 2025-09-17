package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388385 Decimal expansion of 2 * exp(-5*Pi/24) * 2^(3/8) * Gamma(3/4)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388385 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388385() {
    super(1, CR.PI.multiply(new Q(-5, 24)).exp().multiply(CR.TWO.pow(new Q(11, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
