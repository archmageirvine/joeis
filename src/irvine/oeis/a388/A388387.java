package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388387 Decimal expansion of (1/2) * exp(Pi / 8) * sqrt(Pi) * 2^(1/8) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388387 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388387() {
    super(0, CR.PI.divide(8).exp().divide(2).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
