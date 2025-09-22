package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388830 Decimal expansion of (1/32) * exp(Pi) * Pi^(7/4) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388830 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388830() {
    super(1, CR.PI.exp().divide(32).multiply(CR.PI.pow(new Q(7, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
