package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388765 Decimal expansion of (1/32) * exp(3*Pi/4) * Pi^(3/2) * sqrt(2) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388765 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388765() {
    super(0, CR.PI.multiply(new Q(3, 4)).exp().divide(32).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
