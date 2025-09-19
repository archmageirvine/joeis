package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388580 Decimal expansion of (1/16) * exp(Pi / 2) * 2^(1/4) * Gamma(5/8)^2 * (2+sqrt(2)) * (2-sqrt(2))^(1/2) / sqrt(Pi) / Gamma(7/8)^2.
 * @author Sean A. Irvine
 */
public class A388580 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388580() {
    super(0, CR.HALF_PI.exp().divide(16).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).multiply(CR.TWO.add(CR.SQRT2)).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()));
  }
}
