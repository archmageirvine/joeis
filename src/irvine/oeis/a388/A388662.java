package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388662 Decimal expansion of (sqrt(Pi) * exp(Pi / 24)) / (2^(3/8) * Gamma(3/4)^2).
 * @author Sean A. Irvine
 */
public class A388662 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388662() {
    super(1, CR.PI.divide(24).exp().divide(2).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
