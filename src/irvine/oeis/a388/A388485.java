package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388485 Decimal expansion of (1/4) * exp(Pi) * Pi^4 / Gamma(11/12)^8 / Gamma(7/12)^8.
 * @author Sean A. Irvine
 */
public class A388485 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388485() {
    super(2, CR.PI.exp().divide(4).multiply(CR.PI.pow(4)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(8)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(8)));
  }
}
