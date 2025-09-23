package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389036 Decimal expansion of (1/32) * Pi^5 / Gamma(3/4)^20.
 * @author Sean A. Irvine
 */
public class A389036 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389036() {
    super(0, CR.PI.pow(5).divide(32).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(20)));
  }
}
