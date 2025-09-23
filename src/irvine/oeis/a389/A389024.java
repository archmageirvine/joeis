package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389024 Decimal expansion of (1/1073741824) * exp(6 * Pi) * Pi^12 / Gamma(3/4)^48.
 * @author Sean A. Irvine
 */
public class A389024 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389024() {
    super(1, CR.PI.multiply(6).exp().divide(1073741824).multiply(CR.PI.pow(12)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(48)));
  }
}
