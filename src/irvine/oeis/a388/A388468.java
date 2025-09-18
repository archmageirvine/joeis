package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388468 Decimal expansion of (1/2) * sqrt(Pi) * 2^(5/8) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388468 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388468() {
    super(0, CR.SQRT_PI.divide(2).multiply(CR.TWO.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
