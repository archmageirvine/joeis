package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388936 Decimal expansion of -1/20 * exp(Pi / 2) * 2^(3/10) * 5^(1/4) * Gamma(4/5)^2 * (-5+5^(1/2)) / Gamma(9/10) / Gamma(7/10).
 * @author Sean A. Irvine
 */
public class A388936 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388936() {
    super(1, CR.HALF_PI.exp().divide(-20).multiply(CR.TWO.pow(new Q(3, 10))).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(4, 5)).square()).multiply(CR.FIVE.sqrt().subtract(5)).divide(CrFunctions.GAMMA.cr(new Q(9, 10))).divide(CrFunctions.GAMMA.cr(new Q(7, 10))));
  }
}
