package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388153 Decimal expansion of (1 / Pi^(17/4)) * Gamma(3/4)^17.
 * @author Sean A. Irvine
 */
public class A388153 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388153() {
    super(0, CR.PI.pow(new Q(17, 4)).inverse().multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(17)));
  }
}
