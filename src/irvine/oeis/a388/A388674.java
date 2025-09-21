package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388674 Decimal expansion of (1/64) * exp(Pi) * Pi^(7/4) * sqrt(2) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388674 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388674() {
    super(0, CR.PI.exp().divide(64).multiply(CR.PI.pow(new Q(7, 4))).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
