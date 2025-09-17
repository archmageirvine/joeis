package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388405 Decimal expansion of (1/35184372088832) * exp(5 * Pi) * Pi^30 / Gamma(3/4)^120.
 * @author Sean A. Irvine
 */
public class A388405 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388405() {
    super(0, CR.PI.multiply(5).exp().divide(35184372088832L).multiply(CR.PI.pow(30)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(120)));
  }
}
