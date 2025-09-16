package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388213 Decimal expansion of (1/16) * exp(5/12 * Pi) * Pi^(5/2) * 2^(1/4) / Gamma(3/4)^10.
 * @author Sean A. Irvine
 */
public class A388213 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388213() {
    super(0, CR.PI.multiply(new Q(5, 12)).exp().divide(16).multiply(CR.PI.pow(new Q(5, 2))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
