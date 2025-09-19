package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388638 Decimal expansion of (1/2) * exp(Pi / 8) * sqrt(Pi) * 2^(1/4) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388638 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388638() {
    super(1, CR.PI.divide(8).exp().divide(2).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
