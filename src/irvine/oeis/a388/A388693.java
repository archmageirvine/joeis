package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388693 Decimal expansion of exp(-Pi/24) / sqrt(Pi) * 2^(5/8) * Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388693 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388693() {
    super(1, CR.PI.divide(-24).exp().divide(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
