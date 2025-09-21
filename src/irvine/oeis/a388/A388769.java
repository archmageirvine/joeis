package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388769 Decimal expansion of (1/16) * exp(5*Pi/8) * Pi * 2^(5/8) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388769 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388769() {
    super(0, CR.PI.multiply(new Q(5, 8)).exp().divide(16).multiply(CR.PI).multiply(CR.TWO.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
