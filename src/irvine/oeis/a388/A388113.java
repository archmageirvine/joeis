package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388113 Decimal expansion of (sqrt(2) * exp(Pi / 2) * Gamma(5/4) * sin(Pi / 8)) / Pi^(3/4).
 * @author Sean A. Irvine
 */
public class A388113 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388113() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 8)).divide(8).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.HALF_PI.exp()).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
