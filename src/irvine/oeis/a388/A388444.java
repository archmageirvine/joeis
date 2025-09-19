package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388444 Decimal expansion of (2/25) * exp(Pi) * sqrt(Pi) * (5+5^(1/2))^2 * (1/4*5^(1/2)-1/4)^4 / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388444 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388444() {
    super(1, CR.PI.exp().multiply(new Q(2, 25)).multiply(CR.SQRT_PI).multiply(CR.FIVE.add(CR.FIVE.sqrt()).square()).multiply(CR.FIVE.sqrt().subtract(1).divide(4).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
