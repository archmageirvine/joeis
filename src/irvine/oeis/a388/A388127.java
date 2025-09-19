package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388127 Decimal expansion of (1 / Pi^3) * Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388127 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388127() {
    super(0, CR.PI.pow(3).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
