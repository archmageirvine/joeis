package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388694 Decimal expansion of 2 * exp(-Pi/24) * 2^(1/8) * Gamma(3/4)^4 / Pi.
 * @author Sean A. Irvine
 */
public class A388694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388694() {
    super(1, CR.PI.divide(-24).exp().multiply(CR.TWO.pow(new Q(9, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CR.PI));
  }
}
