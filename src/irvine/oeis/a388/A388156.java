package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388156 Decimal expansion of 1 / Pi^5 * Gamma(3/4)^20.
 * @author Sean A. Irvine
 */
public class A388156 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388156() {
    super(0, CR.PI.pow(5).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(20)));
  }
}
