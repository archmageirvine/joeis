package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388215 Decimal expansion of (1/32) * exp(13/24 * Pi) * Pi^(13/4) * 2^(1/8) / Gamma(3/4)^13.
 * @author Sean A. Irvine
 */
public class A388215 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388215() {
    super(0, CR.PI.multiply(new Q(13, 24)).exp().divide(32).multiply(CR.PI.pow(new Q(13, 4))).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(13)));
  }
}
