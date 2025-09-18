package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388494 Decimal expansion of 2 * exp(-Pi/24) * sqrt(Pi) * 2^(3/8) * Gamma(7/8)^2 / Gamma(5/8)^2 / (2+sqrt(2))^(1/2).
 * @author Sean A. Irvine
 */
public class A388494 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388494() {
    super(1, CR.PI.divide(-24).exp().multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(11, 8))).multiply(CrFunctions.GAMMA.cr(new Q(7, 8)).square()).divide(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).divide(CR.TWO.add(CR.SQRT2).sqrt()));
  }
}
