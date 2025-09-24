package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388921 Decimal expansion of -exp(-Pi/3) * Gamma(5/8) * (2+sqrt(2))^(1/2) / (sqrt(2)-2) / Pi^(1/4) / Gamma(7/8).
 * @author Sean A. Irvine
 */
public class A388921 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388921() {
    super(1, CR.PI.divide(-3).exp().multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.TWO.subtract(CR.SQRT2)).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
