package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388159 Decimal expansion of 1 / Pi^(23/4) * Gamma(3/4)^23.
 * @author Sean A. Irvine
 */
public class A388159 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388159() {
    super(0, CR.PI.pow(new Q(23, 4)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(23)));
  }
}
