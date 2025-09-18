package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388500 Decimal expansion of 32 * Gamma(3/4)^8 / Pi^2.
 * @author Sean A. Irvine
 */
public class A388500 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388500() {
    super(2, CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8).multiply(32).divide(CR.PI.square()));
  }
}
