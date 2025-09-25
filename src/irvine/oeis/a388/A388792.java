package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388792 Decimal expansion of (sqrt(2 * (-1+sqrt(2))) * exp((5 * Pi) / 8) * Gamma(5/4)^2) / Pi^(3/2).
 * @author Sean A. Irvine
 */
public class A388792 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388792() {
    super(0, CR.PI.multiply(new Q(5, 8)).exp().divide(32).divide(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).multiply(CR.TWO.add(CR.SQRT2)).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()));
  }
}
