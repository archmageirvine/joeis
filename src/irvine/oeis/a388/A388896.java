package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388896 Decimal expansion of 1/18 * exp(5*Pi/6) * Pi / Gamma(11/12)^2 / Gamma(7/12)^2.
 * @author Sean A. Irvine
 */
public class A388896 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388896() {
    super(0, CR.PI.multiply(new Q(5, 6)).exp().divide(18).multiply(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).square()));
  }
}
