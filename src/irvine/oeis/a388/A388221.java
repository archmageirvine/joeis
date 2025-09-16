package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388221 Decimal expansion of (1/256) * exp(5*Pi/6) * Pi^5 * sqrt(2) / Gamma(3/4)^20.
 * @author Sean A. Irvine
 */
public class A388221 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388221() {
    super(0, CR.PI.multiply(new Q(5, 6)).exp().divide(256).multiply(CR.PI.pow(5)).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(20)));
  }
}
