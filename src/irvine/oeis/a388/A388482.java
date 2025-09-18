package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388482 Decimal expansion of (1/2) * Pi / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388482 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388482() {
    super(0, CR.HALF_PI.divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
