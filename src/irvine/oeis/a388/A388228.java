package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388228 Decimal expansion of (1/2048) * exp(7*Pi/6) * Pi^7 * sqrt(2) / Gamma(3/4)^28.
 * @author Sean A. Irvine
 */
public class A388228 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388228() {
    super(0, CR.PI.multiply(new Q(7, 6)).exp().divide(2048).multiply(CR.PI.pow(7)).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(28)));
  }
}
