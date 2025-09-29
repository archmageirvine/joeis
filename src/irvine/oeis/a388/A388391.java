package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388391 Decimal expansion of (4 * sqrt((2+sqrt(2)) / Pi) * Gamma(5/4)^2) / Pi.
 * @author Sean A. Irvine
 */
public class A388391 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388391() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).square().divide(8).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).multiply(CR.SQRT2).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()));
  }
}
