package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388764 Decimal expansion of (1/32) * exp(Pi / 4) * Gamma(5/8)^3 * (2+sqrt(2))^2 * sqrt(2) / Pi^(3/4) / Gamma(7/8)^3.
 * @author Sean A. Irvine
 */
public class A388764 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388764() {
    super(1, CR.PI.divide(4).exp().divide(32).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).square()).multiply(CR.SQRT2).divide(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
