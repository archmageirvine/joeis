package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388828 Decimal expansion of (1/2) * Pi^4 / Gamma(11/12)^8 / Gamma(7/12)^8.
 * @author Sean A. Irvine
 */
public class A388828 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388828() {
    super(1, CR.PI.pow(4).divide(2).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(8)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(8)));
  }
}
