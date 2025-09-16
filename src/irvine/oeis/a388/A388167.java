package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388167 Decimal expansion of (1/2) * exp(Pi / 4) * Pi^(3/4) * 2^(3/4) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388167 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388167() {
    super(1, CR.PI.divide(4).exp().divide(2).multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
