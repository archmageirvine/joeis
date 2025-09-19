package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388569 Decimal expansion of (1/2) * exp(Pi / 24) * Pi^(1/4) * 2^(3/4) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388569 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388569() {
    super(1, CR.PI.divide(24).exp().divide(2).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
