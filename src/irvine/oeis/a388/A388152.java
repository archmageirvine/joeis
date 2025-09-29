package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388152 Decimal expansion of Gamma(3/4)^16 / Pi^4.
 * @author Sean A. Irvine
 */
public class A388152 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388152() {
    super(0, CR.PI.pow(4).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(16)));
  }
}
