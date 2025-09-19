package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388617 Decimal expansion of (1/4) * exp(Pi / 4) * sqrt(2 * Pi) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388617 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388617() {
    super(0, CR.PI.divide(4).exp().divide(4).multiply(CR.TAU.sqrt()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
