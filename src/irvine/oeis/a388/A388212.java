package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388212 Decimal expansion of (1/16) * exp(3*Pi/8) * Pi^(9/4) * 2^(5/8) / Gamma(3/4)^9.
 * @author Sean A. Irvine
 */
public class A388212 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388212() {
    super(0, CR.PI.multiply(new Q(3, 8)).exp().divide(16).multiply(CR.PI.pow(new Q(9, 4))).multiply(CR.TWO.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(9)));
  }
}
