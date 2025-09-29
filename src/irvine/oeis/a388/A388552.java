package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388552 Decimal expansion of (2*2^(3/8) * sqrt((2+sqrt(2)) / Pi) * exp(Pi / 8) * Gamma(5/4)^2) / Pi.
 * @author Sean A. Irvine
 */
public class A388552 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388552() {
    super(1, CR.PI.divide(8).exp().divide(16).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()));
  }
}
