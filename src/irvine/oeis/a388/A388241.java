package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388241 Decimal expansion of (1/256) * exp(3*Pi/2) * Pi^3 * sqrt(2) / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388241 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388241() {
    super(1, CR.PI.multiply(new Q(3, 2)).exp().divide(256).multiply(CR.PI.pow(3)).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
