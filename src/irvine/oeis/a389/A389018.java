package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389018 Decimal expansion of (1/8) * exp(Pi / 24) * Pi^2*2^(7/8) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A389018 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389018() {
    super(0, CR.PI.divide(24).exp().divide(8).multiply(CR.PI.square()).multiply(CR.TWO.pow(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
