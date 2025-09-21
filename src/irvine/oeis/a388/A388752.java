package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388752 Decimal expansion of (1/4) * exp(Pi / 4) * Pi^(5/2) * sqrt(2) / Gamma(3/4)^10.
 * @author Sean A. Irvine
 */
public class A388752 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388752() {
    super(1, CR.PI.divide(4).exp().divide(4).multiply(CR.PI.pow(new Q(5, 2))).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
