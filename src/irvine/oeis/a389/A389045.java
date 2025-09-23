package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389045 Decimal expansion of 4 * sqrt(Pi) * Gamma(7/8)^2 * (2-sqrt(2))^(1/2) / (2+sqrt(2)) / Gamma(5/8)^2.
 * @author Sean A. Irvine
 */
public class A389045 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389045() {
    super(0, CR.SQRT_PI.multiply(4).multiply(CrFunctions.GAMMA.cr(new Q(7, 8)).square()).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.TWO.add(CR.SQRT2)).divide(CrFunctions.GAMMA.cr(new Q(5, 8)).square()));
  }
}
