package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388158 Decimal expansion of 1 / Pi^(11/2) * Gamma(3/4)^22.
 * @author Sean A. Irvine
 */
public class A388158 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388158() {
    super(0, CR.PI.pow(new Q(11, 2)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(22)));
  }
}
