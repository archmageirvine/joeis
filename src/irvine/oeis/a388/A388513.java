package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388513 Decimal expansion of (1/8) * exp(Pi) / sqrt(Pi) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388513 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388513() {
    super(1, CR.PI.exp().divide(8).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
