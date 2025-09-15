package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388090 Decimal expansion of 1/8 * exp(7/24 * Pi) * Pi^(7/4) * 2^(3/8) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388090 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388090() {
    super(0, CR.PI.multiply(new Q(7, 24)).exp().divide(8).multiply(CR.PI.pow(new Q(7, 4))).multiply(CR.TWO.pow(new Q(3, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
