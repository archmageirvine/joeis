package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388472 Decimal expansion of 2 * exp(-Pi/24) * Pi^(1/4) * Gamma(7/8) * (2-sqrt(2)) / Gamma(5/8).
 * @author Sean A. Irvine
 */
public class A388472 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388472() {
    super(1, CR.PI.divide(-24).exp().multiply(2).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(5, 8))).multiply(CR.TWO.subtract(CR.SQRT2)));
  }
}
