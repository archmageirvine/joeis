package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388787 Decimal expansion of (1/64) * exp(Pi) * Pi / Gamma(3/4)^22 * Gamma(11/12)^9 * Gamma(7/12)^9.
 * @author Sean A. Irvine
 */
public class A388787 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388787() {
    super(0, CR.PI.exp().divide(64).multiply(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(22)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(9)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(9)));
  }
}
