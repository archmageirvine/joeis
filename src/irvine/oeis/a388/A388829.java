package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388829 Decimal expansion of (1/128) * exp(-5*Pi/4) * 2^(7/10) * Gamma(3/5)^4 * Gamma(7/10)^2 * (5+5^(1/2))^2 * (5^(1/2)+1)^4 / Pi^2 / Gamma(9/10)^2.
 * @author Sean A. Irvine
 */
public class A388829 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388829() {
    super(1, CR.PI.multiply(new Q(-5, 4)).exp().divide(128).multiply(CR.TWO.pow(new Q(7, 10))).multiply(CrFunctions.GAMMA.cr(new Q(3, 5)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).square()).multiply(CR.FIVE.add(CR.FIVE.sqrt()).square()).multiply(CR.FIVE.sqrt().add(1).pow(4)).divide(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(9, 10)).square()));
  }
}
