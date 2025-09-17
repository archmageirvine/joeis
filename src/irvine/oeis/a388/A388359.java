package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388359 Decimal expansion of 16 * exp(-11*Pi/24) * 2^(1/8) * Gamma(3/4)^11 / Pi^(11/4).
 * @author Sean A. Irvine
 */
public class A388359 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388359() {
    super(1, CR.PI.multiply(new Q(-11, 24)).exp().multiply(16).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(11)).divide(CR.PI.pow(new Q(11, 4))));
  }
}
