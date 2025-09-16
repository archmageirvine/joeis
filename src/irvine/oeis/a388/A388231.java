package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388231 Decimal expansion of (1/4096) * exp(31*Pi/24) * Pi^(31/4) * 2^(3/8) / Gamma(3/4)^31.
 * @author Sean A. Irvine
 */
public class A388231 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388231() {
    super(0, CR.PI.multiply(new Q(31, 24)).exp().divide(4096).multiply(CR.PI.pow(new Q(31, 4))).multiply(CR.TWO.pow(new Q(3, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(31)));
  }
}
