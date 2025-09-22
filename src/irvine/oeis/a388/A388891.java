package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388891 Decimal expansion of (1/6) * exp(Pi / 3) * sqrt(Pi) * 2^(7/8) / Gamma(11/12) / Gamma(7/12).
 * @author Sean A. Irvine
 */
public class A388891 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388891() {
    super(0, CR.PI.divide(3).exp().divide(6).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CrFunctions.GAMMA.cr(new Q(7, 12))));
  }
}
