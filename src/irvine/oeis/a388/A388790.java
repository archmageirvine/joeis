package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388790 Decimal expansion of Pi * Gamma(3/4)^2 / Gamma(11/12)^3 / Gamma(7/12)^3.
 * @author Sean A. Irvine
 */
public class A388790 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388790() {
    super(1, CR.PI.multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)));
  }
}
