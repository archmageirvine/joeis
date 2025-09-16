package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388121 Decimal expansion of 1 / Pi^(3/2) * Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388121 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388121() {
    super(0, CR.PI.pow(new Q(3, 2)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
