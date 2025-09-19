package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388150 Decimal expansion of (1 / Pi^(7/2)) * Gamma(3/4)^14.
 * @author Sean A. Irvine
 */
public class A388150 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388150() {
    super(0, CR.PI.pow(new Q(7, 2)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(14)));
  }
}
