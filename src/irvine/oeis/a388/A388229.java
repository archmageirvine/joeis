package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388229 Decimal expansion of (1/2048) * exp(29*Pi/24) * Pi^(29/4) * 2^(1/8) / Gamma(3/4)^29.
 * @author Sean A. Irvine
 */
public class A388229 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388229() {
    super(0, CR.PI.multiply(new Q(29, 24)).exp().divide(2048).multiply(CR.PI.pow(new Q(29, 4))).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(29)));
  }
}
