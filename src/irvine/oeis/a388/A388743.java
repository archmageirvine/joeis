package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388743 Decimal expansion of (1/2) * Pi * 2^(3/4) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388743 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388743() {
    super(1, CR.HALF_PI.multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
