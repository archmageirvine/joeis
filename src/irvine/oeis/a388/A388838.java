package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388838 Decimal expansion of exp(-Pi/12) * 2^(7/16) * Gamma(7/8) * Pi^(1/4) * (2-sqrt(2))^(1/4) / Gamma(5/8).
 * @author Sean A. Irvine
 */
public class A388838 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388838() {
    super(0, CR.PI.divide(-12).exp().multiply(CR.TWO.pow(new Q(7, 16))).multiply(CrFunctions.GAMMA.cr(new Q(7, 8))).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.subtract(CR.SQRT2).pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(5, 8))));
  }
}
