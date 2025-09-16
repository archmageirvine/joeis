package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388218 Decimal expansion of (1/128) * exp(17*Pi/24) * Pi^(17/4) * 2^(5/8) / Gamma(3/4)^17.
 * @author Sean A. Irvine
 */
public class A388218 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388218() {
    super(0, CR.PI.multiply(new Q(17, 24)).exp().divide(128).multiply(CR.PI.pow(new Q(17, 4))).multiply(CR.TWO.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(17)));
  }
}
