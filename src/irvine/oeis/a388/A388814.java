package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388814 Decimal expansion of (1/16) * exp(2*Pi/3) * Pi^(3/2) * sqrt(2) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388814 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388814() {
    super(1, CR.PI.multiply(new Q(2, 3)).exp().divide(16).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
