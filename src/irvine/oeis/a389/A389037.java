package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389037 Decimal expansion of (1/64) * Pi^6 / Gamma(3/4)^24.
 * @author Sean A. Irvine
 */
public class A389037 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389037() {
    super(0, CR.PI.pow(6).divide(64).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(24)));
  }
}
