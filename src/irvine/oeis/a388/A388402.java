package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388402 Decimal expansion of (3/8) * Pi^3 / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388402 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388402() {
    super(1, CR.PI.pow(3).multiply(new Q(3, 8)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
