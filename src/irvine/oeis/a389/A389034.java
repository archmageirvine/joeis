package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389034 Decimal expansion of 1048576 * exp(-4 * Pi) * Gamma(3/4)^20 / Pi^5.
 * @author Sean A. Irvine
 */
public class A389034 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389034() {
    super(0, CR.PI.multiply(-4).exp().multiply(1048576).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(20)).divide(CR.PI.pow(5)));
  }
}
