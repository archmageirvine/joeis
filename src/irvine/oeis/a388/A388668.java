package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388668 Decimal expansion of (1/32) * exp(-Pi / 2) * 2^(3/5) * 5^(1/4) * Gamma(3/5)^2 * Gamma(7/10) * (5+5^(1/2)) * (5^(1/2)+1)^2 / Pi / Gamma(9/10).
 * @author Sean A. Irvine
 */
public class A388668 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388668() {
    super(0, CR.HALF_PI.negate().exp().divide(32).multiply(CR.TWO.pow(new Q(3, 5))).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 5)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 10))).multiply(CR.FIVE.add(CR.FIVE.sqrt())).multiply(CR.FIVE.sqrt().add(1).square()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(9, 10))));
  }
}
