package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388119 Decimal expansion of Gamma(3/4)^3 / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388119 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388119() {
    super(0, CR.PI.pow(new Q(3, 4)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
