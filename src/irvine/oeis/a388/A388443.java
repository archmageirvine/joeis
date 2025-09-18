package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388443 Decimal expansion of (1/32) * exp(5*Pi/8) * 2^(7/8) * Gamma(5/8)^2 * (2+sqrt(2)) * (2-sqrt(2))^(1/2) / sqrt(Pi) / Gamma(7/8)^2.
 * @author Sean A. Irvine
 */
public class A388443 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388443() {
    super(1, CR.PI.multiply(new Q(5, 8)).exp().divide(32).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).multiply(CR.TWO.add(CR.SQRT2)).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()));
  }
}
