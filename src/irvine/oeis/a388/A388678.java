package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388678 Decimal expansion of (1/4) * exp(7*Pi/24) * Pi^(3/4) * 2^(1/4) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388678 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388678() {
    super(0, CR.PI.multiply(new Q(7, 24)).exp().divide(4).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
