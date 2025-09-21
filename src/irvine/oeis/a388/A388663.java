package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388663 Decimal expansion of (1/4) * exp(7*Pi/24) * sqrt(Pi) * 2^(3/8) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388663 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388663() {
    super(0, CR.PI.multiply(new Q(7, 24)).exp().divide(4).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(3, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
