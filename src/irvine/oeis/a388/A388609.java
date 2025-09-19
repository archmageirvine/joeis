package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388609 Decimal expansion of (1/20) * sqrt(Pi) * (5+5^(1/2)) * 5^(1/2) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388609 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388609() {
    super(0, CR.SQRT_PI.divide(20).multiply(CR.FIVE.add(CR.FIVE.sqrt())).multiply(CR.FIVE.sqrt()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
