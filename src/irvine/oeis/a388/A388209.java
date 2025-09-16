package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388209 Decimal expansion of (729/64) * Pi^6 / Gamma(3/4)^24.
 * @author Sean A. Irvine
 */
public class A388209 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388209() {
    super(2, CR.PI.pow(6).multiply(new Q(729, 64)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(24)));
  }
}
