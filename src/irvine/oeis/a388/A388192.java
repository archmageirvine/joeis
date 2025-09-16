package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388192 Decimal expansion of (1/4) * exp(Pi / 4) * sqrt(Pi) * 2^(3/4) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388192 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388192() {
    super(1, CR.PI.divide(4).exp().divide(4).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
