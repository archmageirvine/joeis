package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388495 Decimal expansion of (sqrt((2-sqrt(2)) * Pi) * exp((11 * Pi) / 24) * Gamma(3/4)^2) / (2^(1/8) * Pi).
 * @author Sean A. Irvine
 */
public class A388495 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388495() {
    super(1, CR.PI.multiply(new Q(11, 24)).exp().multiply(CR.TWO.pow(new Q(11, 8))).multiply(CR.SQRT_PI).multiply(CrFunctions.GAMMA.cr(new Q(7, 8)).square()).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.TWO.add(CR.SQRT2)).divide(CrFunctions.GAMMA.cr(new Q(5, 8)).square()));
  }
}
